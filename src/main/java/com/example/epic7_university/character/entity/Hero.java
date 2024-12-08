package com.example.epic7_university.character.entity;

import com.example.epic7_university.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

import java.util.List;

@Entity
@Getter
@Setter
@FieldNameConstants
@NoArgsConstructor( access = AccessLevel.PROTECTED )
public class Hero extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Enumerated( EnumType.STRING )
    private Constellation constellation;
    @Enumerated( EnumType.STRING )
    private HeroClass heroClass;
    @Enumerated( EnumType.STRING )
    private Element element;
    private String name;
    private String realName;
    @OneToOne()
    @JoinColumn( name = "release_id" )
    private Imprint imprintRelease;
    @OneToOne()
    @JoinColumn( name = "concentration_id" )
    private Imprint imprintConcentration;
    private int birthGrade;
    @Enumerated( EnumType.STRING )
    private GetType getType;
    @Enumerated( EnumType.STRING )
    private Stats mainStats;
    @OneToMany( mappedBy = "hero" )
    private List<Skill> skill;
}
