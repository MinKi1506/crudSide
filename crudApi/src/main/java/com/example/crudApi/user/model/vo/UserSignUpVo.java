package com.example.crudApi.user.model.vo;

import com.example.crudApi.user.model.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSignUpVo {

    private String email;

    private String password;

    private String name;

    private String nickname;

    @Builder
    public UserSignUpVo(String email, String password, String name, String nickname){
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
