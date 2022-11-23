package com.example.WebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface SendMailRepository extends JpaRepository {
    @Procedure(procedureName = "DBAITEWKD.LIB_SECURITY.p_alter_user_mail")
    void alter_user_mail(String anmeldename, String email_adresse);
}
