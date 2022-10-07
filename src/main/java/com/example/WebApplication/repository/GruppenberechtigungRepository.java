package com.example.WebApplication.repository;

import com.example.WebApplication.entity.Gruppenberechtigung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GruppenberechtigungRepository extends JpaRepository<Gruppenberechtigung, String> {
}
