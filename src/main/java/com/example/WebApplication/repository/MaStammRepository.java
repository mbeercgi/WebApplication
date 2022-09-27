package com.example.WebApplication.repository;

import com.example.WebApplication.entity.MaStamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
/*
public interface MaStammRepository extends JpaRepository<MaStamm, String> {
}
*/

public interface MaStammRepository extends CrudRepository<MaStamm, String> {
}
