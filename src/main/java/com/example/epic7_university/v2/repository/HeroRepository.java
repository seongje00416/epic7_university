package com.example.epic7_university.v2.repository;

import com.example.epic7_university.v2.entity.Hero;
import com.example.epic7_university.v2.entity.type.HeroClass;
import com.example.epic7_university.v2.entity.type.HeroElement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {
    Page<Hero> findAllByGrade( Pageable pageable, int grade );
    Page<Hero> findAllByHeroClass( Pageable pageable, HeroClass heroClass );
    Page<Hero> findAllByElement( Pageable pageable, HeroElement element );
    Page<Hero> findAllByGradeAndHeroClass( Pageable pageable, int grade, HeroClass heroClass );
    Page<Hero> findAllByGradeAndElement( Pageable pageable, int grade, HeroElement element );
    Page<Hero> findAllByHeroClassAndElement( Pageable pageable, HeroClass heroClass, HeroElement element );
    Page<Hero> findAllByGradeAndHeroClassAndElement( Pageable pageable, int grade, HeroClass heroClass, HeroElement element );
}
