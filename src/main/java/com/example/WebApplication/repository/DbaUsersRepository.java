package com.example.WebApplication.repository;

import com.example.WebApplication.entity.DbaRoles;
import com.example.WebApplication.entity.DbaUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DbaUsersRepository extends JpaRepository<DbaUsers, String> {
}
