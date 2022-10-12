package com.example.WebApplication.service;

import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.repository.GruppenberechtigungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GruppenberechtigungService {

    @Autowired
    GruppenberechtigungRepository gruppenberechtigungRepository;
    //getting all mastamm record by using the method findaAll() of CrudRepository


    public List<Gruppenberechtigung> getAllGruppenberechtigung(){
        List<Gruppenberechtigung> Gruppenberechtigung = new ArrayList<Gruppenberechtigung>();
        gruppenberechtigungRepository.findAll().forEach(gruppenberechtigung1 -> Gruppenberechtigung.add(gruppenberechtigung1));
        return Gruppenberechtigung;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Gruppenberechtigung getGruppenberechtigungByID(String anmeldename){
        return gruppenberechtigungRepository.findById(anmeldename).get();
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
