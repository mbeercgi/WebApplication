package com.example.WebApplication.controller;

import com.example.WebApplication.entity.MaStamm;
import com.example.WebApplication.repository.MaStammRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mastamm")
public class MaStammController {

    private MaStammRepository mastammRepository;

    public MaStammController(MaStammRepository maStammRepository) {
        this.mastammRepository = maStammRepository;
    }

    @GetMapping("")
    public List<MaStamm> index(){
        return mastammRepository.findAll();
    }

}
