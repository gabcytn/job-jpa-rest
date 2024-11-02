package com.gabcytn.springjparest.Repository;

import com.gabcytn.springjparest.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    List<Job> findAllByOrderByIdAsc();
}
