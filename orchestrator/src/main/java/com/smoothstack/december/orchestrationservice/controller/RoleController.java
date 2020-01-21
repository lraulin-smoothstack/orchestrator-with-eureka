package com.smoothstack.december.orchestrationservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.december.orchestrationservice.entity.Role;
import com.smoothstack.december.orchestrationservice.service.RoleService;

@RestController
@RequestMapping("/lms/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN_USER')")
    public List<Role> getRoles() {
        return this.roleService.findAllRoles();
    }

}
