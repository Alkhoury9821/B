package com.example.B.Model;

public class Consumer {


    private int id;

    private String username;

    public Consumer(int id, String username) {
        this.username = username;
    }

    public Consumer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
