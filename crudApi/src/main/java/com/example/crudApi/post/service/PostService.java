package com.example.crudApi.post.service;

import com.example.crudApi.post.model.vo.PostRequestVo;
import com.example.crudApi.post.model.vo.PostResponseVo;

import java.util.List;

public interface PostService {

//    게시물 생성
    void addPost(PostRequestVo postRequestVo);
//    게시물 1개 조회
    PostResponseVo getPost(Long postNum);

//    게시물 전체 조회
    List<PostResponseVo> getPostList();

//    게시물 수정
    String editPost(Long postNum, PostRequestVo postRequestVo);

//    게시물 삭제
    void deletePost(Long postNum);

//    조회수 증가
    void plusView(Long postNum);
}
