package com.softserve.edu.entity;

import javax.persistence.GeneratedValue;

public class Entity {
    private int id; // must be unique
    private String name;

    // TODO

    //Constructors
    public Entity() {

    }


    //getters, setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
