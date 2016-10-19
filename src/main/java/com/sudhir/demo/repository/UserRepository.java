package com.sudhir.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudhir.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
