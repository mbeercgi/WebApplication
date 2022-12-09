package com.example.WebApplication.repository;

import com.example.WebApplication.entity.MaStamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordLockRepository extends JpaRepository<MaStamm, String> {
    @Modifying
    @Procedure(procedureName = "DAPAADMIN.DB_ACCOUNT_LOCK")
    void password_lock(@Param("benutzer")String anmeldename);

    @Modifying
    @Procedure(procedureName = "DAPAADMIN.DB_ACCOUNT_UNLOCK")
    void password_unlock(@Param("benutzer")String anmeldename);

}
