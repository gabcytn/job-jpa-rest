package com.gabcytn.springjparest.Service;

import com.gabcytn.springjparest.Model.TechStack;
import com.gabcytn.springjparest.Repository.TechStackRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechStackService {

    private final TechStackRepo techStackRepo;

    public TechStackService(TechStackRepo techStackRepo) {
        this.techStackRepo = techStackRepo;
    }

    public void addTechStack(List<String> techStack, int id) {
        for(String tech: techStack) {
            techStackRepo.save(new TechStack(id, tech));
        }
    }
}
