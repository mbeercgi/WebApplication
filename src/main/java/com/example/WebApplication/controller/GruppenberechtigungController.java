package com.example.WebApplication.controller;

import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.service.GruppenberechtigungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gruppenberechtigung")
@CrossOrigin(origins = "*")
public class GruppenberechtigungController {

    @Autowired
    private GruppenberechtigungService gruppenberechtigungService;


    @GetMapping("/mastamm")
    private List<Gruppenberechtigung>getGruppenberechtigung(){
        return gruppenberechtigungService.getAllGruppenberechtigung();
    }


    @GetMapping("/gruppenberechtigung/{anmeldename}")
    private Gruppenberechtigung getGruppenberechtigung(@PathVariable("anmeldename") String anmeldename){
        return gruppenberechtigungService.getGruppenberechtigungByID(anmeldename);
    }

}


