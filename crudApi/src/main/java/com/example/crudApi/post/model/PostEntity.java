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

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "userNum")

    @Column(length = 50)
    private int views;

    @Builder
    public PostEntity(String title, String content, Long writerNum, int views){
        this.title = title;
        this.content = content;
        this.writerNum = writerNum;
        this.views = views;
    }
}
