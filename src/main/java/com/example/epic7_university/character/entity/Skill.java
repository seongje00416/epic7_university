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
    // 보유 캐릭터
    @ManyToOne
    @JoinColumn( name = "hero_id" )
    private Hero hero;
    // 기술 이름
    private String name;
    // 스킬 형태
    @Enumerated( EnumType.STRING )
    private SkillType skillType;
    // 스킬 위치
    private int skillNumber;
    // 스킬 아이콘 이미지
    private String skillImageURL;
    // 스킬 설명
    private String description;
    // 스킬 최대 강화 레벨
    private int maxEnhanceValue;
    // 소모 소울번 개수
    private int soulBurnCount;
    // 소울번 효과 설명
    private String soulBurnEffect;
}
