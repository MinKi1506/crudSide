package com.example.crudApi.post.service;

import com.example.crudApi.post.model.PostEntity;
import com.example.crudApi.post.model.vo.PostRequestVo;
import com.example.crudApi.post.model.vo.PostResponseVo;
import com.example.crudApi.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

//    게시물 생성
    @Transactional
    @Override
    public void addPost(PostRequestVo postRequestVo) {
        postRepository.save(postRequestVo.toEntity());
    }

//    게시물 1개 조회
    @Override
    public PostResponseVo getPost(Long postNum) {
        return null;
    }

//    게시물 전체 조회
    @Override
    public List<PostResponseVo> getPostList() {
        List<PostEntity> postEntityList = postRepository.findAll();
        List<PostResponseVo> postResponseVoList = new ArrayList<>();
        return null;
    }

//    게시물 수정
    @Transactional
    @Override
    public String editPost(Long postNum, PostRequestVo postRequestVo) {
       PostEntity postEntity = this.postRepository.findById(postNum)
               .orElseThrow(() -> new IllegalArgumentException("해당 글을 찾을 수 없습니다."));

       postEntity.update(postRequestVo.getTitle(), postRequestVo.getContent());
       return "edited";
    }

//    게시물 삭제
    @Transactional
    @Override
    public void deletePost(Long postNum) {
        PostEntity postEntity = this.postRepository.findById(postNum)
                .orElseThrow(() -> new IllegalArgumentException("해당 글을 찾을 수 없습니다."));

        postRepository.deleteById(postNum);
    }

//    조회수 증가
    @Transactional
    @Override
    public void plusView(Long postNum){
        PostEntity postEntity = this.postRepository.findById(postNum)
                .orElseThrow(() -> new IllegalArgumentException("해당 글을 찾을 수 없습니다."));

        postRepository.updateViews(postNum);
    }
//    public void plusView(Long postNum) {
//        PostEntity postEntity = this.postRepository.findById(postNum)
//                .orElseThrow(() -> new IllegalArgumentException("해당 글을 찾을 수 없습니다."));
//
//        int view = postEntity.getViews();
//        postEntity.plusView(view+1);
//    }
}
