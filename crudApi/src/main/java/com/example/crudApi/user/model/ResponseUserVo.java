package com.example.crudApi.user.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseUserVo {

    private String email;

    private String name;

    private String nickName;

//    Entity -> DTO
    @Builder
    public ResponseUserVo(UserEntity userEntity){
        this.email = userEntity.getEmail();
        this.name = userEntity.getName();
        this.nickName = userEntity.getNickname();
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
