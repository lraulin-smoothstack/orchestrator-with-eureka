package com.smoothstack.december.orchestrationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.december.orchestrationservice.entity.User;
import com.smoothstack.december.orchestrationservice.service.UserService;

@RestController
@RequestMapping("lms/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

}
