package com.example.WebApplication.controller;

import com.example.WebApplication.entity.GrantedRoles;
import com.example.WebApplication.entity.GruppeKz;
import com.example.WebApplication.repository.GrantedRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class GrantedRoleController {

    @Autowired
    GrantedRoleRepository grantedRoleRepository;

    @GetMapping("/berechtigungen/dbarole")
    public List<GrantedRoles> getAll(){ return (List<GrantedRoles>) grantedRoleRepository.findAll();}
}
