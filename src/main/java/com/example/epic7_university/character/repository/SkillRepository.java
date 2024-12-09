package com.example.epic7_university.character.repository;

import com.example.epic7_university.character.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
