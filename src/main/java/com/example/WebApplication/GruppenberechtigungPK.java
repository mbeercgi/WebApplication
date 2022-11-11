package com.example.WebApplication;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GruppenberechtigungPK implements Serializable {


    @Column
    public String anmeldename;

    @Column
    public int bdf_kz;

    @Column
    public String gruppe_kz;

    @Column
    public int verdichtung_kz;

    public GruppenberechtigungPK(){

    }

    public GruppenberechtigungPK(String anmeldename, int bdf_kz, String gruppe_kz, int verdichtung_kz) {
        this.anmeldename = anmeldename;
        this.bdf_kz = bdf_kz;
        this.gruppe_kz = gruppe_kz;
        this.verdichtung_kz = verdichtung_kz;
    }

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

    public int getVerdichtung_kz() {
        return verdichtung_kz;
    }

    public void setVerdichtung_kz(int verdichtung_kz) {
        this.verdichtung_kz = verdichtung_kz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GruppenberechtigungPK that = (GruppenberechtigungPK) o;
        return bdf_kz == that.bdf_kz && verdichtung_kz == that.verdichtung_kz && Objects.equals(anmeldename, that.anmeldename) && Objects.equals(gruppe_kz, that.gruppe_kz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anmeldename, bdf_kz, gruppe_kz, verdichtung_kz);
    }
}
