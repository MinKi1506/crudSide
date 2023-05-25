package com.example.crudApi.post.controller;

import com.example.crudApi.post.model.PostEntity;
import com.example.crudApi.post.repository.PostRepository;
import com.example.crudApi.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

    PostService postService;
    PostRepository postRepository;

    //게시물 생성

    //게시물 1개 조회

    //게시물 전체 조회
//    @GetMapping("/posts")
//    public Page<PostEntity> getAllPosts() {
//        PageRequest pageRequest = PageRequest.of(0,5);
//        return postRepository.findAll(pageRequest);
//    }

    @GetMapping("/posts")
    public Page<PostEntity> getAllPosts(Pageable pageable) {
        return postRepository.findAll(pageable);
    }


    //게시물 수정

    //게시물 삭제

    //게시물 조회수 +1
}
