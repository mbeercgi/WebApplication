package com.example.WebApplication.controller;

import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.service.GruppenberechtigungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class GruppenberechtigungController {

    @Autowired
    GruppenberechtigungService gruppenberechtigungService;

    @GetMapping("/berechtigungen/{anmeldename}")
    public List<Gruppenberechtigung> getGruppenberechtigungByAnmeldename(@PathVariable(name = "anmeldename") String anmeldename){
        return gruppenberechtigungService.findByAnmeldename(anmeldename);
    }

    @PostMapping("/berechtigungen")
    Gruppenberechtigung newGruppenberechtigung(@RequestBody Gruppenberechtigung newGruppenberechtigung){
        return gruppenberechtigungService.saveNew(newGruppenberechtigung);
    }



    /*@GetMapping("/berechtigungen/{anmeldename}")
    public List<Gruppenberechtigung> getBerechtigungByAnmeldename(@PathVariable String anmeldename){
        return gruppenberechtigungService.getBerechtigungByAnmeldename(anmeldename);
    }

     */
/*

    @DeleteMapping("/berechtigungen/{anmeldename}")
    private void deleteBerechtigungen(@PathVariable("anmeldename") String anmeldename){
        gruppenberechtigungService.delete(anmeldename);
    }
 */

    /*@PostMapping("/berechtigungen")
    private String saveBerechtigungen(@RequestBody Gruppenberechtigung gruppenberechtigung){
        gruppenberechtigungService.saveOrUpdate(gruppenberechtigung);
        return gruppenberechtigung.getAnmeldename();
    }




    @PutMapping("/berechtigungen")
    private Gruppenberechtigung update(@RequestBody Gruppenberechtigung gruppenberechtigung){
        gruppenberechtigungService.saveOrUpdate(gruppenberechtigung);
        return gruppenberechtigung;
    }*/
}


