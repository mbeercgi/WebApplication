package com.example.WebApplication.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(schema= "einkauf" , name = "ma_stamm")
public class MaSuche {

    @Id
    private String anmeldename;
    private String name;
    private String vorname;
    private String abteilung;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_adresse_nr")
    @Fetch(FetchMode.JOIN)
    private Email email_adresse;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "anmeldename")
    @Fetch(FetchMode.JOIN)
    private DbaUsers dbausers;

    public MaSuche(){

    }

    // Constructor
    public MaSuche(String anmeldename, String name, String vorname, String abteilung, Email email_adresse, DbaUsers dbausers) {
        this.anmeldename = anmeldename;
        this.name = name;
        this.vorname = vorname;
        this.abteilung = abteilung;
        this.email_adresse = email_adresse;
        this.dbausers = dbausers;

    }

    // getter setter
    public String getAnmeldename() {
        return anmeldename;
    }

    public void setAnmeldename(String anmeldename) {
        this.anmeldename = anmeldename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public Email getEmail_adresse() {
        return email_adresse;
    }

    public void setEmail_adresse(Email email_adresse) {
        this.email_adresse = email_adresse;
    }

    public DbaUsers getDbausers() { return dbausers; }

    public void setDbausers(DbaUsers dbausers) { this.dbausers = dbausers; }
}
