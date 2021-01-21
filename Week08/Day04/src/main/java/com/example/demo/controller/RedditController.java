package com.example.demo.controller;


import com.example.demo.model.RedditPost;
import com.example.demo.repository.RedditRepo;
import com.example.demo.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class RedditController {
    private RedditRepo redditRepo;
    private RedditService redditService;

    @Autowired
    public RedditController(RedditRepo redditRepo, RedditService redditService){
        this.redditRepo = redditRepo;
        this.redditService = redditService;
    }

    @GetMapping("/")
    public String show(Model model){
        model.addAttribute("postList", redditService.get10PostByVote(2));
        return "index";
    }

    @PostMapping("add-post")
    public String addPost(@ModelAttribute RedditPost redditPost){
        redditService.addPost(redditPost);
        return "redirect:/";
    }

    @GetMapping("view-post/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        model.addAttribute("redditPost", redditRepo.findById(id).orElse(null));
        RedditPost redditPostCurrent = redditService.handleOptional(id);
        model.addAttribute("postTitle", redditPostCurrent.getTitle());
        model.addAttribute("postContent", redditPostCurrent.getContent());
        return "content";
    }

    @PostMapping("upvote/{id}")
    public String upVotePost(@PathVariable Long id, Model model){
        model.addAttribute("postList", redditService.get10PostByVote(1));
        model.addAttribute("redditPost", redditRepo.findById(id).orElse(null));
        RedditPost redditPostCurrent = redditService.handleOptional(id);
        redditService.upVotePost(redditPostCurrent.getId());
        return "index";
    }

    @PostMapping("downvote/{id}")
    public String downVotePost(@PathVariable Long id, Model model){
        model.addAttribute("postList", redditService.get10PostByVote(1));
        model.addAttribute("redditPost", redditRepo.findById(id).orElse(null));
        RedditPost redditPostCurrent = redditService.handleOptional(id);
        redditService.downVotePost(redditPostCurrent.getId());
        return "index";
    }

}
