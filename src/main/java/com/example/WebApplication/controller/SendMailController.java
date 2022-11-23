package com.example.WebApplication.controller;

import com.example.WebApplication.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class SendMailController {

    @Autowired
    SendMailService sendMailService;

    @PostMapping("send-mail/{anmeldename}&{emailadresse}")
    public void alter_user_mail(@PathVariable("anmeldename") String anmeldename, @PathVariable("email_adresse") String email_adresse){
        sendMailService.alter_user_mail(anmeldename, email_adresse);
    }
}
