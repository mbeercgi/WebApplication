package com.example.WebApplication.repository;

import com.example.WebApplication.DbaRolePK;
import com.example.WebApplication.entity.DbaRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface DbaRolesRepository extends JpaRepository<DbaRoles, DbaRolePK> {
    List<DbaRoles> findByIdGrantee(String grantee);

    @Modifying
    @Procedure(procedureName = "DAPAADMIN.REVOKE_USER")
    void revoke_user(@Param("benutzer") String anmeldename, @Param("applikation") String anwendung);


    @Modifying
    @Procedure(procedureName = "DAPAADMIN.GRANT_USER")
    void grant_user(@Param("benutzer")String anmeldename, @Param("applikation") String anwendung);
}
