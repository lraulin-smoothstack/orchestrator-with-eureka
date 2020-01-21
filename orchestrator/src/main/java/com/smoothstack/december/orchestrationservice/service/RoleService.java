package com.smoothstack.december.orchestrationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.december.orchestrationservice.dao.RoleDAO;
import com.smoothstack.december.orchestrationservice.entity.Role;

@Service
public class RoleService {

    @Autowired
    private RoleDAO roleDAO;

    public List<Role> findAllRoles() {
        return this.roleDAO.findAll();
    }

}
