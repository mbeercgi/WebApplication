package com.example.WebApplication.controller;

import com.example.WebApplication.entity.MaStamm;
import com.example.WebApplication.repository.EmailRepository;
import com.example.WebApplication.repository.GruppenberechtigungRepository;
import com.example.WebApplication.repository.MaStammRepository;
import com.example.WebApplication.service.MaStammService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class MaStammController {
    //autowire the mastammService class
    @Autowired
    MaStammService maStammService;

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

    //creating a delete mapping that deletes a specified mastamm
    @DeleteMapping("/mastamm/{anmeldename}")
    private void deleteMaStamm(@PathVariable("anmeldename") String anmeldename){
        maStammService.delete(anmeldename);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("mastamm")
    private String saveMaStamm(@RequestBody MaStamm maStamm){
        maStammService.saveOrUpdate(maStamm);
        return maStamm.getAnmeldename();
    }

    //creating put mapping that updates the book detail
    @PutMapping("/mastamm")
    private MaStamm update(@RequestBody MaStamm maStamm){
        maStammService.saveOrUpdate(maStamm);
        return maStamm;
    }

}


























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


