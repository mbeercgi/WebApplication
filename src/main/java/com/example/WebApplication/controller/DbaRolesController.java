package com.example.WebApplication.controller;

import com.example.WebApplication.entity.DbaRoles;
import com.example.WebApplication.repository.DbaRolesRepository;
import com.example.WebApplication.service.DbaRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@CrossOrigin("*")
public class DbaRolesController {

    @Autowired
    DbaRolesRepository dbaRolesRepository;
    @Autowired
    DbaRolesService dbaRolesService;

    @GetMapping("/dba-roles")
    public List<DbaRoles> getAll(){ return dbaRolesRepository.findAll();}

    @GetMapping("/dba-roles/{grantee}")
    public List<DbaRoles> getDbaRolesByGrantee(@PathVariable(name = "grantee") String grantee){
        return dbaRolesService.findByGrantee(grantee);
    }

    @DeleteMapping("/dba-roles/{anmeldename}&{anwendung}")
    public void revoke_user(@PathVariable("anmeldename") String anmeldename, @PathVariable("anwendung") String anwendung){
       dbaRolesService.revoke_user(anmeldename, anwendung);
    }


    @PostMapping("/dba-roles/{anmeldename}&{anwendung}")
    public void grant_user(@PathVariable("anmeldename") String anmeldename, @PathVariable("anwendung") String anwendung){
        dbaRolesService.grant_user(anmeldename, anwendung);
    }

}
