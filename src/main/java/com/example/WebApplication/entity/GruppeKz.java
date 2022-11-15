package com.example.WebApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "einkauf", name = "k_gruppe")
public class GruppeKz {

    @Id
    @Column
    private String gruppe_kz;

    public String getGruppe_kz() {
        return gruppe_kz;
    }

    public void setGruppe_kz(String gruppe_kz) {
        this.gruppe_kz = gruppe_kz;
    }
}
