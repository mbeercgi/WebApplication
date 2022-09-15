package com.example.WebApplication.entity;

import javax.persistence.*;

@Entity
@Table(name = "dapaadmin.ma_stamm")
public class MaStamm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String abteilung;
    private String anmeldename;
    private int bdf_kz;
    private int email_adresse_nr;
    private String gruppe_kz;
    private int kostenstelle_nr;
    private String name;
    private int personal_nr;
    private int telefon_nr;
    private int ungueltig_kz;
    private String vorname;
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

}


// dapaadmin.ma_stamm