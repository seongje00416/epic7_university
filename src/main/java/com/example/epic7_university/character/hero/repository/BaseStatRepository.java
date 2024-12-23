package com.example.epic7_university.character.hero.repository;

import com.example.epic7_university.character.hero.entity.BaseStat;
import com.example.epic7_university.character.hero.entity.Constellation;
import com.example.epic7_university.character.hero.entity.HeroClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BaseStatRepository extends JpaRepository<BaseStat, Long> {
    Optional<BaseStat> findByHeroId( Long heroId );
}
