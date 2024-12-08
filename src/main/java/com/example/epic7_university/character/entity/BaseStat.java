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
    @Enumerated( EnumType.STRING )
    private Constellation constellation;
    @Enumerated( EnumType.STRING )
    private Element element;
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
