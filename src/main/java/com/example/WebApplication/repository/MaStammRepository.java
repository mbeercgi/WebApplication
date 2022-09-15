package com.example.WebApplication.repository;

import com.example.WebApplication.entity.MaStamm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaStammRepository extends JpaRepository<MaStamm, String> {
}
