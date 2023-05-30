package com.example.crudApi.user.controller;

import com.example.crudApi.user.model.UserEntity;
import com.example.crudApi.user.model.vo.UserResponseVo;
import com.example.crudApi.user.model.vo.UserSignUpVo;
import com.example.crudApi.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    //회원가입 관리자(userNum=1) 유저(userNum!=1)
    @PostMapping("/signUp")
    public ResponseEntity signUp(@RequestBody UserSignUpVo userSignUpVo){
        return this.userService.signUp(userSignUpVo);
    }

    //유저 전체 조회
    @GetMapping("/getAllUser")
    public List<UserResponseVo> getAllUser(){
        return this.userService.getAllUser();
    }

    //유저 삭제
    @DeleteMapping("/deleteUser/{userNum}")
    public void deleteUser(Long userNum){
        this.userService.deleteUser(userNum);
    }

    //로그인
}
