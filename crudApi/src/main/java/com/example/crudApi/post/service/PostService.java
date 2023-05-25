package com.example.crudApi.post.service;

import com.example.crudApi.post.model.PostEntity;
import com.example.crudApi.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {

    PostRepository postRepository;

    @Transactional
    public Page<PostEntity> pageList(Pageable pageable){
        return postRepository.findAll(pageable);
    }

}
