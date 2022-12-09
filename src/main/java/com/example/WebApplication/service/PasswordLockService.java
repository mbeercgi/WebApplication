package com.example.WebApplication.service;

import com.example.WebApplication.repository.PasswordLockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordLockService {

    @Autowired
    PasswordLockRepository passwordLockRepository;
    public void password_lock(String anmeldename) {
        passwordLockRepository.password_lock(anmeldename);
    }

    public void password_unlock(String anmeldename) {
        passwordLockRepository.password_unlock(anmeldename);
    }
}
