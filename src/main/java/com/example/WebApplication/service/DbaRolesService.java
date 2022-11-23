package com.example.WebApplication.service;

import com.example.WebApplication.entity.DbaRoles;
import com.example.WebApplication.repository.DbaRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DbaRolesService {

    @Autowired
    DbaRolesRepository dbaRolesRepository;

    public List<DbaRoles> findByGrantee(String grantee) {
        return dbaRolesRepository.findByIdGrantee(grantee);
    }

    public void revoke_user(String anmeldename, String anwendung){
         anwendung = anwendung.replaceAll("_ROLE", "");
         dbaRolesRepository.revoke_user(anmeldename, anwendung);
    }

    public void grant_user(String anmeldename, String anwendung){
        dbaRolesRepository.grant_user(anmeldename,anwendung);
    }
}
