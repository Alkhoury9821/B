package com.example.B.Model;

import javax.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @Column(nullable = false)
    private String ProductName;


    @Column(nullable = false)
    private String from;


    public Order(String productName, String from) {
        ProductName = productName;
        this.from = from;
    }


    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
