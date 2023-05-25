package com.example.crudApi.user.service;

import com.example.crudApi.user.model.UserEntity;
import com.example.crudApi.user.model.vo.UserSignInVo;
import com.example.crudApi.user.model.vo.UserSignUpVo;
import com.example.crudApi.user.model.vo.UserResponseVo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    //회원가입 관리자(userNum=1) 유저(userNum!=1)
    ResponseEntity signUp(UserSignUpVo userSignUpVo);

    //유저 전체 조회
    List<UserResponseVo> getAllUser();

    //유저 삭제
    void deleteUser(Long userNum);

    //로그인
    ResponseEntity signIn(UserSignInVo userSignInVo);
}
