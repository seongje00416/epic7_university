package com.example.epic7_university.user.character.entity;

import com.example.epic7_university.character.entity.Hero;
import com.example.epic7_university.common.entity.UserBaseEntity;
import com.example.epic7_university.user.account.entity.Heir;
import com.example.epic7_university.user.equipment.entity.Equipment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldNameConstants
public class UserHero extends UserBaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @OneToOne
    @JoinColumn( name = "hero_id" )
    private Hero hero;
    @OneToOne
    @JoinColumn( name = "heir_id" )
    private Heir heir;
    private int level;
    private int arousalValue;
    private int skillEnhance1;
    private int skillEnhance2;
    private int skillEnhance3;
    @OneToMany( mappedBy = "id" )
    private List<Equipment> equipmentList;
}
