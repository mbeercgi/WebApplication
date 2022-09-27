package com.example.WebApplication.service;

import com.example.WebApplication.entity.MaStamm;
import com.example.WebApplication.repository.MaStammRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaStammService {
    @Autowired
    MaStammRepository maStammRepository;
    //getting all mastamm record by using the method findaAll() of CrudRepository
    public List<MaStamm> getAllMaStamm(){
        List<MaStamm> MaStamm = new ArrayList<MaStamm>();
        maStammRepository.findAll().forEach(maStamm1 -> MaStamm.add(maStamm1));
        return MaStamm;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public MaStamm getMaStammById(String anmeldename){
        return maStammRepository.findById(anmeldename).get();
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(MaStamm maStamm){
        maStammRepository.save(maStamm);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(String anmeldename){
        maStammRepository.deleteById(anmeldename);
    }

    //updating a record
    public void update(MaStamm maStamm, String anmeldename){
        maStammRepository.save(maStamm);
    }
}
