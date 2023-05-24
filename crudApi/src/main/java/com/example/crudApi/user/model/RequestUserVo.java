package com.example.crudApi.user.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequestUserVo {

    private String email;

    private String password;

    private String name;

    private String nickname;

    @Builder
    public RequestUserVo(String email, String password, String name, String nickname){
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
    }

//    DTO -> Entity
    public UserEntity toEntity(){
        return UserEntity.builder()
                .email(email)
                .password(password)
                .name(name)
                .nickname(nickname)
                .build();
    }
}
