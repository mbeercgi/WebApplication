package com.example.WebApplication.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Gruppenberechtigung")
@Table(name = "ma_gruppenberechtigung", schema = "einkauf")
public class Gruppenberechtigung {

    @Id
    @Column
    private String anmeldename;

    @Column
    private int bdf_kz;

    @Column
    private String gruppe_kz;

    @Column
    private int kdf_toechter_kz;

    @Column(columnDefinition = "date")
    private Date ungueltig_datum;

    @Column
    private int verdichtung_kz;

    //@ManyToOne
    //@JoinColumn(name = "anmeldename")
    //private MaStamm maStamm;

    public Gruppenberechtigung(int bdf_kz){
        this.bdf_kz = bdf_kz;
    }

    // ###################################################################################




    public String getAnmeldename() {
        return anmeldename;
    }

    public void setAnmeldename(String anmeldename) {
        this.anmeldename = anmeldename;
    }

    public int getBdf_kz() {
        return bdf_kz;
    }

    public void setBdf_kz(int bdf_kz) {
        this.bdf_kz = bdf_kz;
    }

    public String getGruppe_kz() {
        return gruppe_kz;
    }

    public void setGruppe_kz(String gruppe_kz) {
        this.gruppe_kz = gruppe_kz;
    }

    public int getKdf_toechter_kz() {
        return kdf_toechter_kz;
    }

    public void setKdf_toechter_kz(int kdf_toechter_kz) {
        this.kdf_toechter_kz = kdf_toechter_kz;
    }

    public Date getUngueltig_datum() {
        return ungueltig_datum;
    }

    public void setUngueltig_datum(Date ungueltig_datum) {
        this.ungueltig_datum = ungueltig_datum;
    }

    public int getVerdichtung_kz() {
        return verdichtung_kz;
    }

    public void setVerdichtung_kz(int verdichtung_kz) {
        this.verdichtung_kz = verdichtung_kz;
    }
}
