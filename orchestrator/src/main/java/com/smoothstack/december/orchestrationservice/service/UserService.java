package com.smoothstack.december.orchestrationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.smoothstack.december.orchestrationservice.dao.UserDAO;
import com.smoothstack.december.orchestrationservice.entity.User;

public class UserService {

    @Autowired
    private UserDAO userDAO;

    public List<User> findAllUsers() {
        return this.userDAO.findAll();
    }

}
