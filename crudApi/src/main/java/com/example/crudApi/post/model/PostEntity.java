package com.example.crudApi.post.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    private String title;

    private String content;

    private Long writerNum;

    private int views;

    @Builder
    public PostEntity(String title, String content, Long writerNum, int views){
        this.title = title;
        this.content = content;
        this.writerNum = writerNum;
        this.views = views;
    }
}
