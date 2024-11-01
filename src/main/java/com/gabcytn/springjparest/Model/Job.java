package com.gabcytn.springjparest.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Job {
    @Id
    private int id;
    private String title;
    private String description;
    private int experience;

    @ElementCollection
    @CollectionTable(name = "tech_stack", joinColumns = @JoinColumn(name = "job_id"))
    @Column(name = "technology")
    private List<String> tech_stack;

    public Job () {}

    public List<String> getTech_stack() {
        return tech_stack;
    }

    public void setTech_stack(List<String> tech_stack) {
        this.tech_stack = tech_stack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
