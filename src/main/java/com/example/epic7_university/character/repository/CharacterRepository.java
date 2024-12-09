package com.example.epic7_university.character.repository;

import com.example.epic7_university.character.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Hero, Long> {
}
