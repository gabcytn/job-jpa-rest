package com.gabcytn.springjparest.Model;

import jakarta.persistence.*;
@Entity
public class TechStack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String technology;

    public String getTechnology() {
        return technology;
    }

}
