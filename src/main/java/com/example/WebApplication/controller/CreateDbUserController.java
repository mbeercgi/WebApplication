package com.example.WebApplication.controller;

import com.example.WebApplication.service.CreateDbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class CreateDbUserController {
    @Autowired
    CreateDbUserService createDbUserService;


    // Datenbank User anlegen:
    @PostMapping("/db-user/{anmeldename}")
    public void create_user(@PathVariable("anmeldename") String anmeldename){
        createDbUserService.create_user(anmeldename);
    }

    // Datenbank User löschen:
    @DeleteMapping("/db-user/{anmeldename}")
    public void drop_user(@PathVariable("anmeldename") String anmeldename){
        createDbUserService.drop_user(anmeldename);
    }
}
