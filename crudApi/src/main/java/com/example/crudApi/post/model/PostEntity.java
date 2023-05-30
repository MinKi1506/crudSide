package com.example.crudApi.post.model;

import com.example.crudApi.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PostEntity extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postNum;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(length = 50)
    private Long writerNum;

    @Column(length = 50)
    private int views;

    @Builder
    public PostEntity(String title, String content, Long writerNum, int views){
        this.title = title;
        this.content = content;
        this.writerNum = writerNum;
        this.views = views;
    }

//    게시글 수정 기능
    public void update(String title, String content) {
        this.title = title;
        this.content =content;
    }


//    조회수 증가 기능
    public void plusView(int addedView) {
        this.views = addedView;
    }
}
