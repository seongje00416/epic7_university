package com.example.epic7_university.user.equipment.entity;

import com.example.epic7_university.common.entity.BaseEntity;
import com.example.epic7_university.user.account.entity.Heir;
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
public class Equipment extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    // 소유자
    @OneToOne
    @JoinColumn( name = "id" )
    private Heir heir;
    // 장비 부위
    @Enumerated( EnumType.STRING )
    private EquipmentParts equipmentParts;
    // 장비 등급
    @Enumerated( EnumType.STRING )
    private EquipmentGrade grade;
    // 장비 주스탯
    @Enumerated( EnumType.STRING )
    private EquipmentStat mainStat;
    private int mainStatValue;
    // 장비 세트
    @Enumerated( EnumType.STRING )
    @Column( name = "equipment_set" )
    private EquipmentSet set;
    // 강화 단계
    private int enhanceValue;
    // 장비 부스탯
    @Enumerated( EnumType.STRING )
    private EquipmentStat stat1;
    private int stat1Value;
    @Enumerated( EnumType.STRING )
    private EquipmentStat stat2;
    private int stat2Value;
    @Enumerated( EnumType.STRING )
    private EquipmentStat stat3;
    private int stat3Value;
    @Enumerated( EnumType.STRING )
    private EquipmentStat stat4;
    private int stat4Value;
}
