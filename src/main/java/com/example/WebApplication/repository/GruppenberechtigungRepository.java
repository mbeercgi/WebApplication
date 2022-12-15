package com.example.WebApplication.repository;

import com.example.WebApplication.GruppenberechtigungPK;
import com.example.WebApplication.entity.Gruppenberechtigung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GruppenberechtigungRepository extends CrudRepository<Gruppenberechtigung, GruppenberechtigungPK> {
    List<Gruppenberechtigung> findByGruppenIdAnmeldename(String anmeldename);

    //void newGruppenberechtigung(String gruppe_kz, int bdf_kz, int kdf_toechter_kz, int verdichtung_kz, String anmeldename);
}
