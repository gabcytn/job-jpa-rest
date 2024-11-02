package com.gabcytn.springjparest.Controller;

import com.gabcytn.springjparest.Model.Job;
import com.gabcytn.springjparest.Service.JobService;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Lazy
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/jobs")
    public List<Job> getJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/job/{id}")
    public Optional<Job> getJob(@PathVariable int id) {
        return jobService.getJobById(id);
    }

    @PostMapping("/job")
    public Job addJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }
}
