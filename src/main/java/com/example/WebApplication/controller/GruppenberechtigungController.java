package com.example.WebApplication.controller;

import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.repository.GruppenberechtigungRepository;
import com.example.WebApplication.service.GruppenberechtigungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class GruppenberechtigungController {

    @Autowired
    GruppenberechtigungService gruppenberechtigungService;

    @Autowired
    GruppenberechtigungRepository gruppenberechtigungRepository;

    @GetMapping("/berechtigungen/{anmeldename}")
    public List<Gruppenberechtigung> getGruppenberechtigungByAnmeldename(@PathVariable(name = "anmeldename") String anmeldename){
        return gruppenberechtigungService.findByAnmeldename(anmeldename);
    }


    @PostMapping("/berechtigungen/gruppe")
    public Gruppenberechtigung save(@RequestBody Gruppenberechtigung gruppenberechtigung) {
        return gruppenberechtigungRepository.save(gruppenberechtigung);
    }


   /* @PostMapping("/berechtigungen/gruppe/{anmeldename}&{gruppe_kz}&{bdf_kz}&${kdf_toechter_kz}&{verdichtung_kz}")
    public void newGruppenberechtigungByAnmeldename(@PathVariable("gruppe_kz") String gruppe_kz, @PathVariable("bdf_kz") int bdf_kz, @PathVariable("kdf_toechter_kz") int kdf_toechter_kz, @PathVariable("verdichtung_kz") int verdichtung_kz, @PathVariable("anmeldename") String anmeldename){
       gruppenberechtigungService.createGruppenberechtigung(gruppe_kz, bdf_kz, kdf_toechter_kz, verdichtung_kz, anmeldename);
    }

    */



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


