package com.example.WebApplication.service;

import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.repository.GruppenberechtigungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class GruppenberechtigungService {

    @Autowired
    GruppenberechtigungRepository gruppenberechtigungRepository;


    public List<Gruppenberechtigung> getAllGruppenberechtigung(){
        List<Gruppenberechtigung> Gruppenberechtigung = new ArrayList<Gruppenberechtigung>();
        gruppenberechtigungRepository.findAll().forEach(gruppenberechtigung1 -> Gruppenberechtigung.add(gruppenberechtigung1));
        return Gruppenberechtigung;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public List<Gruppenberechtigung> getGruppenberechtigungByID(String anmeldename){
       List<Gruppenberechtigung> Gruppenberechtigung = new ArrayList<>();
       gruppenberechtigungRepository.findAllById(Collections.singleton(anmeldename)).forEach(gruppenberechtigung -> Gruppenberechtigung.add(gruppenberechtigung));
       return Gruppenberechtigung;
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Gruppenberechtigung gruppenberechtigung){
        gruppenberechtigungRepository.save(gruppenberechtigung);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(String anmeldename){
        gruppenberechtigungRepository.deleteById(anmeldename);
    }

    //updating a record
    public void update(Gruppenberechtigung gruppenberechtigung, String anmeldename){
        gruppenberechtigungRepository.save(gruppenberechtigung);
    }
}
