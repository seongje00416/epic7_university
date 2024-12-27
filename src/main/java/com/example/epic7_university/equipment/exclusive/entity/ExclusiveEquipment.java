package com.example.epic7_university.equipment.exclusive.entity;

import com.example.epic7_university.character.hero.entity.Hero;
import com.example.epic7_university.common.entity.BaseEntity;
import com.example.epic7_university.equipment.equips.entity.EquipOption;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExclusiveEquipment extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn( name = "use_hero_id" )
    private Hero hero;
    @Enumerated( EnumType.STRING )
    private EquipOption option;
    private int minValue;
    private int maxValue;
    private int skillNum;
    private String description;

    public ExclusiveEquipment(
            Long id,
            String name,
            Hero hero,
            EquipOption option,
            int maxValue,
            int minValue,
            int skillNum,
            String description
    ) {
        this.id = id;
        this.name = name;
        this.hero = hero;
        this.option = option;
        this.skillNum = skillNum;
        this.description = description;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
}
