package com.example.demo.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
public class RedditPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Integer upvotecount=0 ;

    public RedditPost(Long id, String title, String content, Integer upvotecount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.upvotecount = upvotecount;
    }

}
