package com.example.WebApplication.controller;

import com.example.WebApplication.service.PasswordLockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class PasswordLockController {

    @Autowired
    PasswordLockService passwordLockService;

    @PutMapping("password-lock/{anmeldename}")
    public void password_lock(@PathVariable("anmeldename") String anmeldename){
        passwordLockService.password_lock(anmeldename);
    }

    @PutMapping("password-unlock/{anmeldename}")
    public void password_unlock(@PathVariable("anmeldename") String anmeldename){
        passwordLockService.password_unlock(anmeldename);
    }

}
