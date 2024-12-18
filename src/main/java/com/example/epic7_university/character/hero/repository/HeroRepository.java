package com.example.epic7_university.character.hero.repository;

import com.example.epic7_university.character.hero.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
