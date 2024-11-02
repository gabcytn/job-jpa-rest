package com.gabcytn.springjparest.Service;

import com.gabcytn.springjparest.Model.Job;
import com.gabcytn.springjparest.Repository.JobRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Lazy
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAllByOrderByIdAsc();
    }

    public Optional<Job> getJobById(int id) {
        return jobRepository.findById(id);
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    public boolean doesJobExist(int id) {
        return jobRepository.existsById(id);
    }

    public void deleteJob (int id) {
        jobRepository.deleteById(id);
    }
}
