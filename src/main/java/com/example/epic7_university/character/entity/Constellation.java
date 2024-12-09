package com.example.epic7_university.character.entity;

import com.example.epic7_university.common.entity.BaseEntity;
import com.example.epic7_university.item.entity.Catalyst;
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
public class Constellation extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    // 별자리 이름
    private String name;
    // 아이콘 주소
    private String iconURL;
    // 각성 희귀 촉매제
    @OneToOne
    @JoinColumn( name = "arousal_catalyst_id" )
    private Catalyst arousalCatalyst;
    // 전설 족매제
    @OneToOne
    @JoinColumn( name = "epic_catalyst_id" )
    private Catalyst epicCatalyst;
    // 스킬 강화 희귀 촉매제
    @OneToOne
    @JoinColumn( name = "skill_enhance_catalyst_id" )
    private Catalyst skillEnhanceCatalyst;
}

