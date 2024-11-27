package com.example.SDAproj.repository;

import com.example.SDAproj.logobj.loginObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<loginObject, Long> {
    // Custom query to find user by username and password
    Optional<loginObject> findByUsernameAndPassword(String username, String password);
}
