package com.smoothstack.december.orchestrationservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.december.orchestrationservice.entity.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {

}
