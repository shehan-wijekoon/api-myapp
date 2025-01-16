package com.example.myapp.repository;

import com.example.myapp.model.ads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adsRepository extends JpaRepository<ads, Integer> {
}
