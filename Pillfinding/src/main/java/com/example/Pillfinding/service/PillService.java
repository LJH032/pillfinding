package com.example.Pillfinding.service;

import com.example.Pillfinding.model.Pill;
import com.example.Pillfinding.repository.PillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PillService {
    @Autowired
    private PillRepository pillRepository;

    public Pill savePill(Pill pill) {
        return pillRepository.save(pill);
    }
}
