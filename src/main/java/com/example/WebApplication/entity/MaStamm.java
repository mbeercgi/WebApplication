package com.example.WebApplication.entity;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(schema= "dapaadmin" , name = "ma_stamm")
public class MaStamm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String anmeldename;

    public String getAnmeldename() {
        return anmeldename;
    }

    public void setAnmeldename(String anmeldename) {
        this.anmeldename = anmeldename;
    }
}

   /* private String abteilung;

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
    private int global_user_id;*/

    /*public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung; */




   /* public int getBdf_kz() {
        return bdf_kz;
    }

    public void setBdf_kz(int bdf_kz) {
        this.bdf_kz = bdf_kz;
    }

    public int getEmail_adresse_nr() {
        return email_adresse_nr;
    }

    public void setEmail_adresse_nr(int email_adresse_nr) {
        this.email_adresse_nr = email_adresse_nr;
    }

    public String getGruppe_kz() {
        return gruppe_kz;
    }

    public void setGruppe_kz(String gruppe_kz) {
        this.gruppe_kz = gruppe_kz;
    }

    public int getKostenstelle_nr() {
        return kostenstelle_nr;
    }

    public void setKostenstelle_nr(int kostenstelle_nr) {
        this.kostenstelle_nr = kostenstelle_nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
/*
    public int getPersonal_nr() {
        return personal_nr;
    }

    public void setPersonal_nr(int personal_nr) {
        this.personal_nr = personal_nr;
    }

    public int getTelefon_nr() {
        return telefon_nr;
    }

    public void setTelefon_nr(int telefon_nr) {
        this.telefon_nr = telefon_nr;
    }

    public int getUngueltig_kz() {
        return ungueltig_kz;
    }

    public void setUngueltig_kz(int ungueltig_kz) {
        this.ungueltig_kz = ungueltig_kz;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getWg_ft_kz() {
        return wg_ft_kz;
    }

    public void setWg_ft_kz(int wg_ft_kz) {
        this.wg_ft_kz = wg_ft_kz;
    }

    public int getWg_ot_nr() {
        return wg_ot_nr;
    }

    public void setWg_ot_nr(int wg_ot_nr) {
        this.wg_ot_nr = wg_ot_nr;
    }

    public int getSap_abte() {
        return sap_abte;
    }

    public void setSap_abte(int sap_abte) {
        this.sap_abte = sap_abte;
    }

    public int getLetzte_a() {
        return letzte_a;
    }

    public void setLetzte_a(int letzte_a) {
        this.letzte_a = letzte_a;
    }

    public int getMulti_session_kzf() {
        return multi_session_kzf;
    }

    public void setMulti_session_kzf(int multi_session_kzf) {
        this.multi_session_kzf = multi_session_kzf;
    }

    public int getGeloeschte_kzf() {
        return geloeschte_kzf;
    }

    public void setGeloeschte_kzf(int geloeschte_kzf) {
        this.geloeschte_kzf = geloeschte_kzf;
    }

    public int getLetzter_() {
        return letzter_;
    }

    public void setLetzter_(int letzter_) {
        this.letzter_ = letzter_;
    }

    public int getTaetigkeit_kz() {
        return taetigkeit_kz;
    }

    public void setTaetigkeit_kz(int taetigkeit_kz) {
        this.taetigkeit_kz = taetigkeit_kz;
    }

    public int getOcn_acco() {
        return ocn_acco;
    }

    public void setOcn_acco(int ocn_acco) {
        this.ocn_acco = ocn_acco;
    }

    public int getGlobal_user_id() {
        return global_user_id;
    }

    public void setGlobal_user_id(int global_user_id) {
        this.global_user_id = global_user_id;
    }*/



// dapaadmin.ma_stamm