package com.example.WebApplication.repository;

import com.example.WebApplication.entity.MaStamm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface MaStammRepository extends JpaRepository<MaStamm, String> {

    @Transactional
    @Modifying
    @Query(value = "update dapaadmin.ma_stamm set ungueltig_kzf = '0' where anmeldename = :anmeldename", nativeQuery = true)
    void setGueltig(String anmeldename);
}
