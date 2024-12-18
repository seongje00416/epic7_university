package com.example.epic7_university.character.hero.entity;

import com.example.epic7_university.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@FieldNameConstants
@NoArgsConstructor
public class BaseStat extends BaseEntity {
    // 별자리, 직업, 태생 등급에 따른 기본 능력치
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Enumerated( EnumType.STRING )
    private Constellation constellation;
    @Enumerated( EnumType.STRING )
    private HeroClass heroClass;
    private int grade;
    // 태생 능력치
    private int attack;
    private int defense;
    private int health;
    private int speed;
    private int criticalHitChance;
    private int criticalHitDamage;
    private int effectiveness;
    private int effectResistance;
    private int dualAttackChance;
}
