package com.gabcytn.springjparest.Repository;

import com.gabcytn.springjparest.Model.TechStack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechStackRepo extends JpaRepository<TechStack, Integer> {
}
