package com.example.tpspring1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "annonce")
public class AnnonceEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "mail")
    private String mail;

    public AnnonceEntity() {
    }

    public AnnonceEntity(Long id, String title, String description, String address, String mail) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.address = address;
        this.mail = mail;
    }

    public AnnonceEntity(String title, String description, String address, String mail) {
        this.title = title;
        this.description = description;
        this.address = address;
        this.mail = mail;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
