package com.example.crudApi.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String nickname;

    @Builder
    public UserEntity(String email, String password, String name, String nickname){
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
    }

}
