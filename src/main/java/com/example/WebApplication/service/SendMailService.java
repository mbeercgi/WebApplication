package com.example.WebApplication.service;

import com.example.WebApplication.repository.SendMailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {

    @Autowired
    SendMailRepository sendMailRepository;

    public void alter_user_mail(String anmeldename, String email_adresse) {
        sendMailRepository.alter_user_mail(anmeldename, email_adresse);

    }
}
