package com.example.B.Model;

import javax.persistence.*;


@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "productName" , nullable = false)
    private String productName;

    @Column(name = "orderFrom" , nullable = false)
    private String orderFrom;


    public Orders(String productName, String orderFrom) {
        this.productName = productName;
        this.orderFrom = orderFrom;
    }

    public Orders() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }
}
