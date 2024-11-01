package com.gabcytn.springjparest.Model;

import jakarta.persistence.*;
@Entity
public class TechStack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String technology;

    @ManyToOne
    private Job job;

    public String getTechnology() {
        return technology;
    }

}
