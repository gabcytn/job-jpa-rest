package com.gabcytn.springjparest.Service;

import com.gabcytn.springjparest.Model.Job;
import com.gabcytn.springjparest.Model.TechStack;
import com.gabcytn.springjparest.Repository.JobRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Lazy
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}
