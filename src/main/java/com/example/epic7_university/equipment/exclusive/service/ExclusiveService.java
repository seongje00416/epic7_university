package com.example.epic7_university.equipment.exclusive.service;

import com.example.epic7_university.equipment.exclusive.repository.ExclusiveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExclusiveService {
    private final ExclusiveRepository exclusiveRepository;
}
