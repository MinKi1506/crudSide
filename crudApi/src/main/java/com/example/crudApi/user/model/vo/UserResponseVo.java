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

//    Entity -> DTO
    @Builder
    public UserResponseVo(UserEntity userEntity){
        this.userNum = userEntity.getUserNum();
        this.email = userEntity.getEmail();
        this.name = userEntity.getName();
    }

//    @PostMapping("/test/account")
//    public AccountSignUpResponse signUp(@RequestBody @Valid final AccountSignUpRequest accountSignUpRequest){
//
//        // Dto to Entity
//        Account account = accountService.signUp(accountSignUpRequest.toEntity());
//
//        // Entity to Dto
//        return AccountSignUpResponse.builder().account(account).build();
//    }

}
