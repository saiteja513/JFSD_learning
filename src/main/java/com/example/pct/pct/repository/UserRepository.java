package com.example.pct.pct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pct.pct.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
