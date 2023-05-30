package com.example.crudApi.post.model.vo;

import com.example.crudApi.post.model.PostEntity;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@NoArgsConstructor
public class PostRequestVo {

    private String title;

    private String content;

    private Long writerNum;


    //  DTO -> Entity
    public PostEntity toEntity(){
        return PostEntity.builder()
                .title(title)
                .content(content)
                .writerNum(writerNum)
                .build();
    }
}
