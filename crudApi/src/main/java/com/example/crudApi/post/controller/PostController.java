package com.example.crudApi.post.controller;

import com.example.crudApi.post.model.PostEntity;
import com.example.crudApi.post.model.vo.PostRequestVo;
import com.example.crudApi.post.model.vo.PostResponseVo;
import com.example.crudApi.post.repository.PostRepository;
import com.example.crudApi.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PostController {

    private final PostService postService;
    private final PostRepository postRepository;

    //게시물 생성
    @PostMapping("/addPost")
    public String addPost(@RequestBody PostRequestVo postRequestVo){
        postService.addPost(postRequestVo);
        return "added";
    }

    //게시물 1개 조회
    @GetMapping("/getPost/{postNum}")
    public PostResponseVo getPost(@PathVariable Long postNum){
        PostResponseVo postResponseVo = postService.getPost(postNum);
        return postResponseVo;
    }

    //게시물 전체 조회
    @GetMapping("/getPostList")
    public List<PostResponseVo> getAllPosts() {
        List<PostResponseVo> postResponseVoList = postService.getPostList();
        return postResponseVoList;
    }

    //게시물 수정
    @PatchMapping("/editPost/{postNum}")
    public String editPost(@PathVariable Long postNum, @RequestBody PostRequestVo postRequestVo){
        postService.editPost(postNum, postRequestVo);
        return "edited";
    }

    //게시물 삭제
    @DeleteMapping("/deletePost/{postNum}")
    public String deletePost(@PathVariable Long postNum){
        postService.deletePost(postNum);
        return "deleted";
    }

    //게시물 조회수 +1
    @GetMapping("/plusView/{postNum}")
    public void plusView(@PathVariable Long postNum){
        postService.plusView(postNum);
    }
}
