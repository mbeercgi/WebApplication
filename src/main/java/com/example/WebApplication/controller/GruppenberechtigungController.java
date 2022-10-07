package com.example.WebApplication.controller;

import com.example.WebApplication.entity.Email;
import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.repository.EmailRepository;
import com.example.WebApplication.repository.GruppenberechtigungRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gruppenberechtigung")
public class GruppenberechtigungController {

    private GruppenberechtigungRepository gruppenberechtigungRepository;

    public GruppenberechtigungController(GruppenberechtigungRepository gruppenberechtigungRepository) {
        this.gruppenberechtigungRepository = gruppenberechtigungRepository;
    }

    @GetMapping("")
    public List<Gruppenberechtigung> index(){
        return gruppenberechtigungRepository.findAll();
    }

}
