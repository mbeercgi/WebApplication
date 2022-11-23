package com.example.WebApplication.controller;

import com.example.WebApplication.UsernameNotFoundException;
import com.example.WebApplication.entity.MaStamm;
import com.example.WebApplication.repository.MaStammRepository;
import com.example.WebApplication.service.MaStammService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MaStammController {
    @Autowired
    MaStammService maStammService;
    @Autowired
    MaStammRepository maStammRepository;

    //creating a get mapping that retrieves all the mastamm detail from the database
    @GetMapping("/mastamm")
    private List<MaStamm>getAllMaStamm(){
        return maStammService.getAllMaStamm();
    }

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/mastamm/{anmeldename}")
    private MaStamm getMaStamm(@PathVariable("anmeldename") String anmeldename){
        return maStammService.getMaStammById(anmeldename);
    }

    //MaStamm User löschen:
    @DeleteMapping("/mastamm/{anmeldename}")
    private void deleteMaStamm(@PathVariable("anmeldename") String anmeldename){
        maStammService.delete(anmeldename);
    }


    // MaStamm User anlegen:
    @PostMapping("/mastamm")
    private String saveMaStamm(@RequestBody MaStamm maStamm){
        maStammService.saveOrUpdate(maStamm);
        return maStamm.getAnmeldename();
    }

    @PutMapping("/mastamm/{anmeldename}")
    public ResponseEntity<MaStamm> updateMaStamm(@PathVariable String anmeldename, @RequestBody MaStamm mastammDetails){
        MaStamm updateMaStamm = maStammRepository.findById(anmeldename)
                .orElseThrow(() -> new UsernameNotFoundException("Der Mitarbeiter mit dem Anmeldename"+ anmeldename +"existiert nicht"));

        updateMaStamm.setAnmeldename(mastammDetails.getAnmeldename());
        updateMaStamm.setName(mastammDetails.getName());
        updateMaStamm.setVorname(mastammDetails.getVorname());
        updateMaStamm.setAbteilung(mastammDetails.getAbteilung());
        updateMaStamm.setBdf_kz(mastammDetails.getBdf_kz());
        updateMaStamm.setGruppe_kz(mastammDetails.getGruppe_kz());
        updateMaStamm.setKostenstelle_nr(mastammDetails.getKostenstelle_nr());
        updateMaStamm.setPersonal_nr(mastammDetails.getPersonal_nr());
        updateMaStamm.setTelefon_nr(mastammDetails.getTelefon_nr());
        updateMaStamm.setUngueltig_kzf(mastammDetails.getUngueltig_kzf());
        updateMaStamm.setVerdichtung_kz(mastammDetails.getVerdichtung_kz());
        updateMaStamm.setWg_ft_kz(mastammDetails.getWg_ft_kz());
        updateMaStamm.setWg_ot_nr(mastammDetails.getWg_ot_nr());
        updateMaStamm.setSap_abteilung(mastammDetails.getSap_abteilung());
        updateMaStamm.setLetzte_aenderung_datum(mastammDetails.getLetzte_aenderung_datum());
        updateMaStamm.setMulti_session_kzf(mastammDetails.getMulti_session_kzf());
        updateMaStamm.setGeloescht_kzf(mastammDetails.getGeloescht_kzf());
        updateMaStamm.setLetzter_login_datum(mastammDetails.getLetzter_login_datum());
        updateMaStamm.setTaetigkeit_kz(mastammDetails.getTaetigkeit_kz());
        updateMaStamm.setOcn_account(mastammDetails.getOcn_account());
        updateMaStamm.setGlobal_user_id(mastammDetails.getGlobal_user_id());
        updateMaStamm.setEmail_adresse(mastammDetails.getEmail_adresse());

        return ResponseEntity.ok(updateMaStamm);
    }
}


    /*
    //creating put mapping that updates the book detail
    private MaStamm update(@RequestBody MaStamm maStamm){
        maStammService.saveOrUpdate(maStamm);
        return maStamm;
    }}

     */


























//########################################################################################
//funktioneller Code
/*
@RestController
@RequestMapping(value = "/mastamm" , method = {RequestMethod.POST, RequestMethod.GET})
@CrossOrigin(origins = "*")
public class MaStammController {

    @Autowired
    private MaStammRepository mastammRepository;

    public MaStammController(MaStammRepository maStammRepository) {
        this.mastammRepository = maStammRepository;
    }

    //get all employee
    @GetMapping("")
    public List<MaStamm> index(){

        return mastammRepository.findAll();
    }
}

*/
//#################################################################################
//Test spring tutorial
/*
@RestController
@CrossOrigin(origins = "*")
class MaStammController {
    private final MaStammRepository repository;

    MaStammController(MaStammRepository repository){
        this.repository = repository;
    }

    @GetMapping("/mastamm")
    public List<MaStamm> all()  {
        return repository.findAll();
    }

    @PostMapping("/mastamm")
    public MaStamm newMaStamm(@Validated @RequestBody MaStamm newMaStamm) {
        return repository.save(newMaStamm);
    }
}
*/







    //create employee
    /*@PostMapping("/mastamm")
    public MaStamm createMaStamm(@Validated @RequestBody MaStamm mastamm){

        return mastammRepository.save(mastamm);
    }*//*
    @PostMapping("")
    public ResponseEntity<MaStamm> create(@Validated @RequestBody CreateMaStammRequest request) {
        return ResponseEntity.ok(MaStammRepository.create(request));
    }*/

   /* //update emloyee
    @PutMapping("/mastamm")
    public MaStamm updateMaStamm(){


    }*/

    /*// deltete employee
    public void deleteMaStamm(@PathVariable(value = "anmeldename") String anmeldename);
        MaStamm mastamm = mastammRepository.findById(anmeldename)

   /* @PostMapping("/mastamm")
    User newUser(@RequestBody User newUser){
        return MaStammRepository.save(newUser);
    }*/


