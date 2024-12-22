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
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @OneToOne
    @JoinColumn( name = "hero_id" )
    private Hero hero;
    // 6성 6각 능력치
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
