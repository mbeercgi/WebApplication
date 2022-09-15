package com.example.WebApplication.entity;

import javax.persistence.*;

@Entity
@Table(name = "dual")
public class Dual {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dummy;

    public String getDummy() {
        return dummy;
    }

    public void setDummy(String dummy) {
        this.dummy = dummy;
    }
}

//@Entity: wird genutzt, damit Spring die Datenbankverwaltung übernimmt und wir
//durch Java Klassen unsere Datenbanktabellen darstellen können


// dapaadmin.ma_stamm