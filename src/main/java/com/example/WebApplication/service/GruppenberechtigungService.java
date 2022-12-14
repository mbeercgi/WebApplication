package com.example.WebApplication.service;


import com.example.WebApplication.entity.Gruppenberechtigung;
import com.example.WebApplication.repository.GruppenberechtigungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GruppenberechtigungService {

    @Autowired
    GruppenberechtigungRepository gruppenberechtigungRepository;

    public List<Gruppenberechtigung> findByAnmeldename(String anmeldename) {
        return gruppenberechtigungRepository.findByGruppenIdAnmeldename(anmeldename);
    }

    /*public Gruppenberechtigung saveNew(Gruppenberechtigung newGruppenberechtigung) {
        return gruppenberechtigungRepository.save(newGruppenberechtigung);
    }

     */

    /*
    public void createGruppenberechtigung(String gruppe_kz, int bdf_kz, int kdf_toechter_kz, int verdichtung_kz, String anmeldename) {
        gruppenberechtigungRepository.save(gruppe_kz, bdf_kz, kdf_toechter_kz, verdichtung_kz, anmeldename);
    }

     */





/*

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Gruppenberechtigung gruppenberechtigung){
        gruppenberechtigungRepository.save(gruppenberechtigung);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(String anmeldename){
        gruppenberechtigungRepository.deleteById(anmeldename);
    }

    //updating a record
    public void update(Gruppenberechtigung gruppenberechtigung, String anmeldename){
        gruppenberechtigungRepository.save(gruppenberechtigung);
    }

 */
}
