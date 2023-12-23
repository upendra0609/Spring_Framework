package com.sikku.bar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sikku.bar.domain.Bar;

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {
  
  
  
}