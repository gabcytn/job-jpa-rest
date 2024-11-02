package com.gabcytn.springjparest.Controller;

import com.gabcytn.springjparest.Model.Job;
import com.gabcytn.springjparest.Service.JobService;
import com.gabcytn.springjparest.Service.TechStackService;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Lazy
public class JobController {

    private final JobService jobService;
    private final TechStackService techStackService;

    public JobController(JobService jobService, TechStackService techStackService) {
        this.jobService = jobService;
        this.techStackService = techStackService;
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
    public Optional<Job> addJob(@RequestBody Job job) {
        jobService.saveJob(job);
        techStackService.addTechStack(job.getTech_stack(), job.getId());

        return jobService.getJobById(job.getId());
    }
}
