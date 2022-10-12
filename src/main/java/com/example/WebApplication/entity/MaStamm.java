package com.example.WebApplication.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Join;
import java.util.*;

@Entity(name = "MaStamm")
@Table(schema= "einkauf" , name = "ma_stamm")
//@SecondaryTable(schema = "einkauf" , name = "email_adresse", pkJoinColumns = {@PrimaryKeyJoinColumn(name = "email_adresse_nr", referencedColumnName="email_adresse_nr")})
public class MaStamm {

    @Id
    @Column(columnDefinition = "varchar2(30)", insertable = false, updatable = false)
    private String anmeldename;

    @Column(columnDefinition = "varchar2(30)", nullable = true)
    private String name;

    @Column(columnDefinition = "varchar2(30)", nullable = true)
    private String vorname;

    @Column(columnDefinition = "varchar2(20)", nullable = true)
    private String abteilung;

    @Column(columnDefinition = "number(2) default '0'", nullable = false)
    private Integer bdf_kz;


    //@Column(columnDefinition = "number(6)", nullable = true, insertable = false, updatable = false)
    // private Integer email_adresse_nr;

    @Column(columnDefinition = "varchar2(30)", nullable = true)
    private String gruppe_kz;

    @Column(columnDefinition = "number(10) default '0'", nullable = false)
    private Integer kostenstelle_nr;

    @Column(columnDefinition = "number(6)", nullable = true)
    private Integer personal_nr;

    @Column(columnDefinition = "varchar2(25)", nullable = true)
    private String telefon_nr;

    @Column(columnDefinition = "number(1) default '0'", nullable = false)
    private Integer ungueltig_kzf;

    @Column(columnDefinition = "number(3)", nullable = true)
    private Integer verdichtung_kz;

    @Column(columnDefinition = "number(2)", nullable = true)
    private Integer wg_ft_kz;

    @Column(columnDefinition = "number(2)", nullable = true)
    private Integer wg_ot_nr;

    @Column(columnDefinition = "varchar2(8)", nullable = true)
    private String sap_abteilung;

    @Column(columnDefinition = "date", nullable = true)
    private Date letzte_aenderung_datum;

    @Column(columnDefinition = "number(1) default '0'", nullable = false)
    private Integer multi_session_kzf;

    @Column(columnDefinition = "number(1) default '0'", nullable = true)
    private Integer geloescht_kzf;

   // @Column(columnDefinition = "date default 'sysdate'", nullable = true)
   // private int letzter_login_datum;

    @Column(columnDefinition = "number(2) default '1'", nullable = true)
    private Integer taetigkeit_kz;

    @Column(columnDefinition = "varchar2(8)", nullable = true)
    private String ocn_account;

    @Column(columnDefinition = "varchar2(100)", nullable = true)
    private String global_user_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_adresse_nr")
    private Email email_adresse;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "email_adresse_nr", referencedColumnName = "email_adresse_nr")
    //private Email email_adresse;


    //@JsonBackReference
    //@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JoinColumn(name = "email_adresse_nr", referencedColumnName = "email_adresse_nr") //name ist der foreignkey zur anderen Tabelle
    //private Email email;

   /* @OneToOne     Funktionierender Code jedoch mit fehler durch mehrere zeilen für eine ID
    @JoinColumn(name = "email_adresse_nr")
    private Email email; */

    /*@ManyToOne(targetEntity = Email.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "email_adresse_nr")
    private Email email;*/

   /* wird nicht genutzt wegen zu langer ladezeit. die Infos ziehen wir erst in der detailansicht
    @OneToMany
    @JoinColumn(name = "anmeldename")
    private List<Gruppenberechtigung> berechtigungen;
*/



    //###################### GETTER / SETTER #############################################################################


    public Email getEmail_adresse() {
        return email_adresse;
    }

    public void setEmail_adresse(Email email_adresse) {
        this.email_adresse = email_adresse;
    }

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

    public Integer getBdf_kz() {
        return bdf_kz;
    }

    public void setBdf_kz(Integer bdf_kz) {
        this.bdf_kz = bdf_kz;
    }


    public String getGruppe_kz() {
        return gruppe_kz;
    }

    public void setGruppe_kz(String gruppe_kz) {
        this.gruppe_kz = gruppe_kz;
    }

    public Integer getKostenstelle_nr() {
        return kostenstelle_nr;
    }

    public void setKostenstelle_nr(Integer kostenstelle_nr) {
        this.kostenstelle_nr = kostenstelle_nr;
    }

    public Integer getPersonal_nr() {
        return personal_nr;
    }

    public void setPersonal_nr(Integer personal_nr) {
        this.personal_nr = personal_nr;
    }

    public String getTelefon_nr() {
        return telefon_nr;
    }

    public void setTelefon_nr(String telefon_nr) {
        this.telefon_nr = telefon_nr;
    }

    public Integer getUngueltig_kzf() {
        return ungueltig_kzf;
    }

    public void setUngueltig_kzf(Integer ungueltig_kzf) {
        this.ungueltig_kzf = ungueltig_kzf;
    }

    public Integer getVerdichtung_kz() {
        return verdichtung_kz;
    }

    public void setVerdichtung_kz(Integer verdichtung_kz) {
        this.verdichtung_kz = verdichtung_kz;
    }

    public Integer getWg_ft_kz() {
        return wg_ft_kz;
    }

    public void setWg_ft_kz(Integer wg_ft_kz) {
        this.wg_ft_kz = wg_ft_kz;
    }

    public Integer getWg_ot_nr() {
        return wg_ot_nr;
    }

    public void setWg_ot_nr(Integer wg_ot_nr) {
        this.wg_ot_nr = wg_ot_nr;
    }

    public String getSap_abteilung() {
        return sap_abteilung;
    }

    public void setSap_abteilung(String sap_abteilung) {
        this.sap_abteilung = sap_abteilung;
    }

    public Integer getMulti_session_kzf() {
        return multi_session_kzf;
    }

    public void setMulti_session_kzf(Integer multi_session_kzf) {
        this.multi_session_kzf = multi_session_kzf;
    }

    public Integer getGeloescht_kzf() {
        return geloescht_kzf;
    }

    public void setGeloescht_kzf(Integer geloescht_kzf) {
        this.geloescht_kzf = geloescht_kzf;
    }

    public Integer getTaetigkeit_kz() {
        return taetigkeit_kz;
    }

    public void setTaetigkeit_kz(Integer taetigkeit_kz) {
        this.taetigkeit_kz = taetigkeit_kz;
    }

    public String getOcn_account() {
        return ocn_account;
    }

    public void setOcn_account(String ocn_account) {
        this.ocn_account = ocn_account;
    }

    public String getGlobal_user_id() {
        return global_user_id;
    }

    public void setGlobal_user_id(String global_user_id) {
        this.global_user_id = global_user_id;
    }

    public Date getLetzte_aenderung_datum() {
        return letzte_aenderung_datum;
    }

    public void setLetzte_aenderung_datum(Date letzte_aenderung_datum) {
        this.letzte_aenderung_datum = letzte_aenderung_datum;
    }
}