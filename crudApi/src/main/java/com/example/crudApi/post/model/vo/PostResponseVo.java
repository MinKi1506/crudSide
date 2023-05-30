package com.example.crudApi.post.model.vo;

import com.example.crudApi.post.model.PostEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostResponseVo {

    private Long postNum;

    private String title;

    private String content;

    private Long writerNum;

    private int views;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;


    //    Entity -> DTO
    @Builder
    public PostResponseVo(PostEntity postEntity){
        this.postNum = postEntity.getPostNum();
        this.title = postEntity.getTitle();
        this.content = postEntity.getContent();
        this.writerNum = postEntity.getWriterNum();
        this.views = postEntity.getViews();
        this.createdDate = postEntity.getCreatedDate();
        this.modifiedDate = postEntity.getModifiedDate();
    }
}
