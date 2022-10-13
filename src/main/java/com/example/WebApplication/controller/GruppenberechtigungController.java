package com.example.WebApplication.controller;

import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.service.GruppenberechtigungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class GruppenberechtigungController {

    @Autowired
    GruppenberechtigungService gruppenberechtigungService;


    @GetMapping("/berechtigungen")
    private List<Gruppenberechtigung>getGruppenberechtigung(){
        return gruppenberechtigungService.getAllGruppenberechtigung();
    }


    @GetMapping("/berechtigungen/{anmeldename}")
    private List<Gruppenberechtigung> getGruppenberechtigung(@PathVariable("anmeldename") String anmeldename){
        return gruppenberechtigungService.getGruppenberechtigungByID(anmeldename);
    }


    @DeleteMapping("/berechtigungen/{anmeldename}")
    private void deleteBerechtigungen(@PathVariable("anmeldename") String anmeldename){
        gruppenberechtigungService.delete(anmeldename);
    }


    @PostMapping("/berechtigungen")
    private String saveBerechtigungen(@RequestBody Gruppenberechtigung gruppenberechtigung){
        gruppenberechtigungService.saveOrUpdate(gruppenberechtigung);
        return gruppenberechtigung.getAnmeldename();
    }


    @PutMapping("/berechtigungen")
    private Gruppenberechtigung update(@RequestBody Gruppenberechtigung gruppenberechtigung){
        gruppenberechtigungService.saveOrUpdate(gruppenberechtigung);
        return gruppenberechtigung;
    }
}


