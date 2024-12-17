package com.example.epic7_university.character.skill.entity;

import com.example.epic7_university.character.hero.entity.Hero;
import com.example.epic7_university.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@FieldNameConstants
public class Skill extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private boolean isPassive;
    private int skillNum;
    private String description;
    private int maxEnhance;
    private String iconURL;
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "hero_id" )
    private Hero useHero;

    @Builder
    public Skill(
            Long id,
            String name,
            boolean isPassive,
            int skillNum,
            String description,
            int maxEnhance,
            String iconURL,
            Hero hero
    ){
        this.id = id;
        this.name = name;
        this.isPassive = isPassive;
        this.skillNum = skillNum;
        this.description = description;
        this.maxEnhance = maxEnhance;
        this.iconURL = iconURL;
        this.useHero = hero;
    }
}
