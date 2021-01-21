package com.example.demo.service;

import com.example.demo.model.RedditPost;
import com.example.demo.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RedditService {
    private RedditRepo redditRepo;

    @Autowired
    public RedditService(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }


    public List<RedditPost> getAllPosts() {
        return (List<RedditPost>) redditRepo.findAll();
    }

    public List<RedditPost> get10Post(int n) {
        Long id = 1L;
        List<RedditPost> get10PostList = new ArrayList<>();
        for (int i = 0; i < ((n + 1) * 10) - 10; i++) {
            RedditPost tempPost = handleOptional(id);
            get10PostList.add(tempPost);
            id = id + 1;
        }
        return get10PostList;
    }

    public List<RedditPost> get10PostByVote(int n) {
        List<RedditPost> get10PostByVote = new ArrayList<>();
        List<RedditPost> tempGet10PostByVote = (List<RedditPost>) redditRepo.findAll();

        for (int i = 0; i < ((n + 1) * 10) - 10; i++) {
            get10PostByVote.add(getMax(tempGet10PostByVote));
            tempGet10PostByVote.remove(getMax(tempGet10PostByVote));
        }
        return get10PostByVote.stream()
                .sorted((p1, p2) -> p2.getUpvotecount().compareTo(p1.getUpvotecount()))
                .collect(Collectors.toList());
    }

    public RedditPost getMax(List<RedditPost> list) {
        int max = Integer.MIN_VALUE;
        RedditPost maxRedditpost = new RedditPost();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUpvotecount() > max) {
                maxRedditpost = list.get(i);
            }
        }
        return maxRedditpost;
    }

    public void addPost(RedditPost redditPost) {
        redditRepo.save(redditPost);
    }

    public RedditPost handleOptional(Long id) {
        Optional<RedditPost> optionalRedditPost = redditRepo.findById(id);
        if (!optionalRedditPost.isPresent()) {
            throw new IllegalArgumentException();
        }
        return optionalRedditPost.get();
    }

    public void deletePost(Long id) {
        redditRepo.deleteById(id);
    }

    public void upVotePost(Long id) {
        Optional<RedditPost> optionalRedditPost = redditRepo.findById(id);
        if (!optionalRedditPost.isPresent()) {
            throw new IllegalArgumentException();
        }
        RedditPost redditPost = optionalRedditPost.get();
        int tempVoteCount = redditPost.getUpvotecount();
        redditPost.setUpvotecount(tempVoteCount + 1);
        redditRepo.save(redditPost);
    }

    public void downVotePost(Long id) {
        Optional<RedditPost> optionalRedditPost = redditRepo.findById(id);
        if (!optionalRedditPost.isPresent()) {
            throw new IllegalArgumentException();
        }
        RedditPost redditPost = optionalRedditPost.get();
        int tempVoteCount = redditPost.getUpvotecount();
        redditPost.setUpvotecount(tempVoteCount - 1);
        redditRepo.save(redditPost);
    }
}
