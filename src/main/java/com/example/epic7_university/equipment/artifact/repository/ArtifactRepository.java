package com.example.epic7_university.equipment.artifact.repository;

import com.example.epic7_university.equipment.artifact.entity.Artifact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtifactRepository extends JpaRepository<Artifact, Long > {
}
