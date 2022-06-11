package com.example.B.Model;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @Column(unique = true , length = 25 , nullable = false)
    private String username;


    public Company(String username) {
        this.username = username;
    }

    public Company() {
    }


    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
