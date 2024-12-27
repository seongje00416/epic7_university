package com.example.epic7_university.equipment.artifact.service;

import com.example.epic7_university.equipment.artifact.repository.ArtifactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArtifactService {
    private final ArtifactRepository artifactRepository;
}
