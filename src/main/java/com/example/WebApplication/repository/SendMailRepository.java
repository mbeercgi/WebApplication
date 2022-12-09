package com.example.WebApplication.repository;

import com.example.WebApplication.entity.MaStamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SendMailRepository extends JpaRepository<MaStamm, String> {
    @Procedure(procedureName = "DBAITEWKD.LIB_SECURITY.p_alter_user_mail")
    void alter_user_mail(@Param("pname") String anmeldename, @Param("pemail") String email_adresse);
}
