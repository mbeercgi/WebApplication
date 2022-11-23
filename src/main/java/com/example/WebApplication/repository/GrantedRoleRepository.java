package com.example.WebApplication.repository;

import com.example.WebApplication.entity.GrantedRoles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrantedRoleRepository extends CrudRepository<GrantedRoles, Integer> {
}
