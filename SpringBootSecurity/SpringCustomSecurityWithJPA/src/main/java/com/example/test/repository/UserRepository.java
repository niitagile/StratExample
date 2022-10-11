package com.example.test.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.model.Users;



public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}