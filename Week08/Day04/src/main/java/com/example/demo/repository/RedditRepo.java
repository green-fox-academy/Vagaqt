package com.example.demo.repository;

import com.example.demo.model.RedditPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditRepo  extends CrudRepository<RedditPost, Long> {
}
