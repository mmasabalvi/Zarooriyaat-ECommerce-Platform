package com.example.SDAproj.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SDAproj.signupobj.SignupEntity;

public interface SignupRepository extends JpaRepository<SignupEntity, Long> {
    Optional<SignupEntity> findByEmailAndPassword(String email, String password);
    Optional<SignupEntity> findByEmail(String email);

}
