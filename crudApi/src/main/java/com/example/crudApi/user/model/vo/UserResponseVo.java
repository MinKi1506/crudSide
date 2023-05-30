package com.example.crudApi.user.model.vo;
import com.example.crudApi.user.model.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserResponseVo {

    private Long userNum;

    private String email;

    private String name;

    private String nickname;

//    Entity -> DTO
    @Builder
    public UserResponseVo(UserEntity userEntity){
        this.userNum = userEntity.getUserNum();
        this.email = userEntity.getEmail();
        this.name = userEntity.getName();
        this.nickname = userEntity.getNickname();
    }
}
