package com.smoothstack.december.orchestrationservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.december.orchestrationservice.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    User findByUsername(String username);
}