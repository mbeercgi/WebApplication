package com.example.WebApplication.entity;

import javax.persistence.*;


@Entity
@Table(schema = "einkauf" , name = "email_adresse")
public class Email {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "email_nr_generator"
    )
    @SequenceGenerator(
            name = "email_nr_generator",
            allocationSize=1,
            sequenceName = "einkauf.seq_email_adresse_nr")
    @Column(name = "email_adresse_nr", columnDefinition = "number(6)")
    public Integer email_adresse_nr;

    @Column(nullable = false)
    public String email_adresse;



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
