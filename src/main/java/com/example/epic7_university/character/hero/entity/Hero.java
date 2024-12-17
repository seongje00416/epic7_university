package com.example.epic7_university.character.hero.entity;

import com.example.epic7_university.character.skill.entity.Skill;
import com.example.epic7_university.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@FieldNameConstants
public class Hero extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private int grade;
    private String imprintRelease;
    private float irIncrease;
    private float irBase;
    private String imprintConcentration;
    private float icIncrease;
    private float icBase;
    private String imageURL;
    @Enumerated( EnumType.STRING )
    private HeroClass heroClass;
    @Enumerated( EnumType.STRING )
    private Constellation constellation;
    @OneToMany( mappedBy = "useHero" )
    private List<Skill> skillList;

    @Builder
    public Hero(
            Long id,
            String name,
            int grade,
            String imprintRelease,
            float irIncrease,
            float irBase,
            String imprintConcentration,
            float icIncrease,
            float icBase,
            String imageURL,
            HeroClass heroClass,
            Constellation constellation
    ){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.imprintRelease = imprintRelease;
        this.irIncrease = irIncrease;
        this.irBase = irBase;
        this.imprintConcentration = imprintConcentration;
        this.icIncrease = icIncrease;
        this.icBase = icBase;
        this.imageURL = imageURL;
        this.heroClass = heroClass;
        this.constellation = constellation;
        this.skillList = new ArrayList<Skill>();
    }
}
