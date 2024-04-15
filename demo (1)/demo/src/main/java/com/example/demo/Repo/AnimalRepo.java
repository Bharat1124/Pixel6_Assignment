package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AnimalEntity;

@Repository
public interface AnimalRepo extends JpaRepository<AnimalEntity, Long> {
}