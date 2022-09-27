package com.example.WebApplication.entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(schema= "dapaadmin" , name = "ma_stamm")
public class MaStamm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private String anmeldename;

    @Column
    private String name;
    @Column
    private String vorname;

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
}

    /*
    private String abteilung;
    private int bdf_kz;
    private int email_adresse_nr;
    private String gruppe_kz;
    private int kostenstelle_nr;

    private int personal_nr;
    private int telefon_nr;
    private int ungueltig_kz;

    private int wg_ft_kz;
    private int wg_ot_nr;
    private int sap_abte;
    private int letzte_a;
    private int multi_session_kzf;
    private int geloeschte_kzf;
    private int letzter_;
    private int taetigkeit_kz;
    private int ocn_acco;
    private int global_user_id;
    */


// dapaadmin.ma_stamm