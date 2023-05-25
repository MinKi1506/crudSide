package com.example.crudApi.user.model.vo;

import com.example.crudApi.user.model.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSignUpVo {

    private String email;

    private String password;

    private String name;

    @Builder
    public UserSignUpVo(String email, String password, String name){
        this.email = email;
        this.password = password;
        this.name = name;
    }

//    DTO -> Entity
    public UserEntity toEntity(){
        return UserEntity.builder()
                .email(email)
                .password(password)
                .name(name)
                .build();
    }
}
