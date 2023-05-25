package com.example.crudApi.user.service;

import com.example.crudApi.user.model.UserEntity;
import com.example.crudApi.user.model.vo.UserSignInVo;
import com.example.crudApi.user.model.vo.UserSignUpVo;
import com.example.crudApi.user.model.vo.UserResponseVo;
import com.example.crudApi.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    //회원가입 관리자(userNum=1) 유저(userNum!=1)
    @Override
    @Transactional
    public ResponseEntity signUp(UserSignUpVo userSignUpVo) {
        Optional<UserEntity> userEntity = this.userRepository.findByEmail(userSignUpVo.getEmail());
        if(!userEntity.isPresent()){
            UserEntity newUser = UserEntity.builder()
                    .email(userSignUpVo.getEmail())
                    .password(userSignUpVo.getPassword())
                    .name(userSignUpVo.getName())
                    .build();
            this.userRepository.save(newUser);

            return new ResponseEntity("회원가입 성공", HttpStatus.OK);
        } else {
            return new ResponseEntity("가입에 실패했습니다.", HttpStatus.OK);
        }
    }

    //유저 전체 조회
    @Override
    public List<UserResponseVo> getAllUser() {
        List<UserEntity> userEntityList = this.userRepository.findAllByOrderByUserNumDesc();
        List<UserResponseVo> userResponseVoList = userEntityList.stream()
                .map(UserResponseVo::new)
                .collect(Collectors.toList());
        return userResponseVoList;
    }

    //유저 삭제
    @Override
    @Transactional
    public void deleteUser(Long userNum) {
        userRepository.deleteByUserNum(userNum);
    }

    //로그인
    @Override
    public ResponseEntity signIn(UserSignInVo userSignInVo) {
        Optional<UserEntity> user = this.userRepository.findByEmail(userSignInVo.getEmail());
        UserEntity userEntity = user.orElse(null);   //user가 null일 경우, userEntity에 null이 할된다 (optional 문법)

        if(userEntity == null) {
            return new ResponseEntity("해당 이메일을 가진 회원이 존재하지 않습니다.", HttpStatus.OK);
        }

        if(userEntity.getPassword().equals(userSignInVo.getPassWord())){
            return new ResponseEntity("로그인 성공", HttpStatus.OK);
        } else {
            return new ResponseEntity("비밀번호가 일치하지 않습니다.", HttpStatus.OK);
        }
    }

}
