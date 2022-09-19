package com.example.WebApplication.entity;

import javax.persistence.*;

@Entity
@Table/*(name = "dapaadmin.ulm_gruppen")*/(schema = "dapaadmin" , name = "ulm_gruppen")
public class Dual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bdf_kz;

    public int getBdf_kz() {
        return bdf_kz;
    }

    public void setBdf_kz(int bdf_kz) {
        this.bdf_kz = bdf_kz;
    }
}

//@Entity: wird genutzt, damit Spring die Datenbankverwaltung übernimmt und wir
//durch Java Klassen unsere Datenbanktabellen darstellen können


// dapaadmin.ma_stamm