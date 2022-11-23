package com.example.WebApplication.repository;

import com.example.WebApplication.entity.MaStamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface CreateDbUserRepository extends JpaRepository<MaStamm, String> {
    @Modifying
    @Procedure(procedureName = "dapaadmin.DROP_USER")
    void drop_user(@Param("benutzer")String anmeldename);

    @Modifying
    @Procedure(procedureName = "dapaadmin.CREATE_USER")
    void create_user(@Param("benutzer") String anmeldename, @Param("passwort") String passwort);
}
