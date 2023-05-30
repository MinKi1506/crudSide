package com.example.crudApi.post.repository;


import com.example.crudApi.post.model.PostEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PostRepository extends JpaRepository<PostEntity, Long> {

    Page<PostEntity> findAllByOrderByPostNumDesc(Pageable pageable);

    @Modifying
    @Query("update PostEntity p set p.views = p.views + 1 where p.postNum = :id")
    int updateViews(@Param("id") Long id);
}
