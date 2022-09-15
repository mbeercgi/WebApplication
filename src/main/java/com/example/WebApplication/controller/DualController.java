package com.example.WebApplication.controller;

import com.example.WebApplication.entity.Dual;
import com.example.WebApplication.repository.DualRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dual")
public class DualController {

    private DualRepository userRepository;

    public DualController(DualRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public List<Dual> index(){
        return userRepository.findAll();
    }
}
