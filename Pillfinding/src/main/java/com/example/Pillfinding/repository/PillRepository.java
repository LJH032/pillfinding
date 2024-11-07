package com.example.Pillfinding.repository;

import com.example.Pillfinding.model.Pill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PillRepository extends JpaRepository<Pill, Long> {
}
