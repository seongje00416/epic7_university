package com.example.epic7_university.character.entity;

import com.example.epic7_university.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
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
    // 이름
    private String name;
    // 본명
    private String realName;
    // 별자리
    @OneToOne
    @JoinColumn( name = "constellation_id" )
    private Constellation constellation;
    // 직업
    @Enumerated( EnumType.STRING )
    private HeroClass heroClass;
    // 속성
    @Enumerated( EnumType.STRING )
    private Element element;
    // 각인 해방
    @Enumerated( EnumType.STRING )
    private Stats imprintRelease;
    private int irBaseValue;
    private int irUpValue;
    // 각인 집중
    @Enumerated( EnumType.STRING )
    private Stats imprintConcentration;
    private int icBaseValue;
    private int icUpValue;
    // 태생 등급
    private int birthGrade;
    // 획득 경로
    @Enumerated( EnumType.STRING )
    private GetType getType;
    // 주 사용 스탯
    @Enumerated( EnumType.STRING )
    private Stats mainStats;
    // 보유 스킬
    @OneToMany( mappedBy = "hero" )
    private List<Skill> skill;

    @Builder
    public Hero(
            Long id,
            String name,
            String realName,
            Constellation constellation,
            HeroClass heroClass,
            Element element,
            Stats imprintRelease,
            int irBaseValue,
            int irUpValue,
            Stats imprintConcentration,
            int icBaseValue,
            int icUpValue,
            int birthGrade,
            GetType getType,
            Stats mainStats
    ){
        this.id = id;
        this.name = name;
        this.realName = realName;
        this.constellation = constellation;
        this.heroClass = heroClass;
        this.element = element;
        this.imprintRelease = imprintRelease;
        this.irBaseValue = irBaseValue;
        this.irUpValue = irUpValue;
        this.imprintConcentration = imprintConcentration;
        this.icBaseValue = icBaseValue;
        this.icUpValue = icUpValue;
        this.birthGrade = birthGrade;
        this.getType = getType;
        this.mainStats = mainStats;
    }
}
