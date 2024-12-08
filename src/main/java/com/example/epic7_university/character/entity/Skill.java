package com.example.epic7_university.character.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldNameConstants
public class Skill {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @ManyToOne
    @JoinColumn( name = "hero_id" )
    private Hero hero;
    private String name;
    @Enumerated( EnumType.STRING )
    private SkillType skillType;
    private int skillNumber;
    private String skillImageURL;
    private String description;
    private int maxEnhanceValue;
    private int soulBurnCount;
    private String soulBurnEffect;
}
