package com.example.WebApplication.controller;

import com.example.WebApplication.entity.DbaRoles;
import com.example.WebApplication.entity.Email;
import com.example.WebApplication.entity.GruppeKz;
import com.example.WebApplication.entity.MaSuche;
import com.example.WebApplication.repository.GruppeKzRepository;
import com.example.WebApplication.repository.MaSucheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class GruppeKzController {
    @Autowired
    GruppeKzRepository gruppeKzRepository;

    @GetMapping("/berechtigungen/gruppekz")
    public List<GruppeKz> getAll(){ return (List<GruppeKz>) gruppeKzRepository.findAll();}
}
