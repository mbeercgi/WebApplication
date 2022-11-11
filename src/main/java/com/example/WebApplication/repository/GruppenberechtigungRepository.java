package com.example.WebApplication.repository;

import com.example.WebApplication.GruppenberechtigungPK;
import com.example.WebApplication.entity.Gruppenberechtigung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GruppenberechtigungRepository extends JpaRepository<Gruppenberechtigung, GruppenberechtigungPK> {
    List<Gruppenberechtigung> findByGruppenIdAnmeldename(String anmeldename);
}
