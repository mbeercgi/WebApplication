package com.example.WebApplication.repository;

import com.example.WebApplication.DbaRolePK;
import com.example.WebApplication.entity.DbaRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DbaRolesRepository extends JpaRepository<DbaRoles, DbaRolePK> {
    List<DbaRoles> findByIdGrantee(String grantee);
}
