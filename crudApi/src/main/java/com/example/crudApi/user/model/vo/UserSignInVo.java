package com.example.crudApi.user.model.vo;

import com.example.crudApi.user.model.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSignInVo {

    private String email;

    private String passWord;



//    Entity -> DTO
    @Builder
    public UserSignInVo(UserEntity userEntity){
        this.email = userEntity.getEmail();
        this.passWord = userEntity.getName();
    }

}
