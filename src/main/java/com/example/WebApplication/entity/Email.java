package com.example.WebApplication.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(schema = "einkauf" , name = "email_adresse")
public class Email {
    @Id
    @Column(name = "email_adresse_nr")
    public Integer email_adresse_nr;

    @Column(insertable = false, updatable = false)
    public String email_adresse;

   //@OneToOne(mappedBy = "email_adresse")
   //private MaStamm ma_stamm;

    //@JsonManagedReference
    //@OneToOne(mappedBy = "email_adresse_nr"/*, cascade = CascadeType.ALL, orphanRemoval = true*/)
    //private MaStamm ma_stamm;
        //mapped by muss hier bei Email stehen ; der mappedby name ist mit der anderen entitie verbunden bei private Email "email"



    // ######################################################################################



    public Integer getEmail_adresse_nr() {
        return email_adresse_nr;
    }

    public void setEmail_adresse_nr(Integer email_adresse_nr) {
        this.email_adresse_nr = email_adresse_nr;
    }

    public String getEmail_adresse() {
        return email_adresse;
    }

    public void setEmail_adresse(String email_adresse) {
        this.email_adresse = email_adresse;
    }
}

//@Entity: wird genutzt, damit Spring die Datenbankverwaltung übernimmt und wir
//durch Java Klassen unsere Datenbanktabellen darstellen können


// dapaadmin.ma_stamm