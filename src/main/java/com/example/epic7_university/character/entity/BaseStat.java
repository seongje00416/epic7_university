package com.example.epic7_university.character.entity;

import com.example.epic7_university.common.entity.BaseEntity;
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
public class BaseStat extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    // 태생 등급
    private int birthGrade;
    // 별자리
    @OneToOne
    @JoinColumn( name = "constellation_id" )
    private Constellation constellation;
    // 직업
    @Enumerated( EnumType.STRING )
    private HeroClass heroClass;
    // 기본 스탯
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
