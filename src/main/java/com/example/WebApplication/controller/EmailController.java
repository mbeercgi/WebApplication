package com.example.WebApplication.controller;

import com.example.WebApplication.entity.Email;
import com.example.WebApplication.repository.EmailRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dual")
public class EmailController {

    private EmailRepository userRepository;

    public EmailController(EmailRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public List<Email> index(){
        return userRepository.findAll();
    }
}
