package com.example.crudApi.user.model.vo;

import com.example.crudApi.user.model.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSignInVo {

    private String email;

    private String password;


//    Entity -> DTO
    @Builder
    public UserSignInVo(UserEntity userEntity){
        this.email = userEntity.getEmail();
        this.password = userEntity.getPassword();
    }

    //    DTO -> Entity
    public UserEntity toEntity(){
        return UserEntity.builder()
                .email(email)
                .password(password)
                .build();
    }

}
