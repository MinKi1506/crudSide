package com.example.crudApi.user.repository;


import com.example.crudApi.user.model.vo.UserResponseVo;
import com.example.crudApi.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    void deleteByUserNum(Long userNum);

    List<UserEntity> findAllByOrderByUserNumDesc();

    Optional<UserEntity> findByEmail(String email);
}
