package com.example.WebApplication.repository;

import com.example.WebApplication.entity.GruppeKz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GruppeKzRepository extends CrudRepository<GruppeKz, String> {
}
