package com.example.WebApplication.entity;
import com.example.WebApplication.GruppenberechtigungPK;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Gruppenberechtigung")
@Table(name = "MA_GRUPPENBERECHTIGUNG", schema = "einkauf")
public class Gruppenberechtigung {

    @EmbeddedId
    private GruppenberechtigungPK gruppenId;

    @Column
    public int kdf_toechter_kz;

    @Column
    public Date ungueltig_datum;

    public Gruppenberechtigung(){

    }
    public Gruppenberechtigung(GruppenberechtigungPK gruppenId, int kdf_toechter_kz, Date ungueltig_datum) {
        gruppenId = gruppenId;
        this.kdf_toechter_kz = kdf_toechter_kz;
        this.ungueltig_datum = ungueltig_datum;
    }

    public GruppenberechtigungPK getGruppenId() {
        return gruppenId;
    }

    public void setGruppenId(GruppenberechtigungPK gruppenId) {
        gruppenId = gruppenId;
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
}