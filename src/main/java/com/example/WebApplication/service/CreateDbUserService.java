package com.example.WebApplication.service;

import com.example.WebApplication.repository.CreateDbUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateDbUserService {

    @Autowired
    CreateDbUserRepository createDbUserRepository;

    public void create_user(String anmeldename) {
        String passwort = "123!PwdAbc";
        createDbUserRepository.create_user(anmeldename, passwort);
    }

    public void drop_user(String anmeldename) {
        createDbUserRepository.drop_user(anmeldename);
    }

}
