package com.gabcytn.springjparest.Model;

import jakarta.persistence.*;
@Entity
public class TechStack {
    @Id
    private int job_id;

    private String technology;

    public TechStack() {}

    public TechStack(int id, String technology) {
        this.job_id = id;
        this.technology = technology;
    }

    public String getTechnology() {
        return technology;
    }

}
