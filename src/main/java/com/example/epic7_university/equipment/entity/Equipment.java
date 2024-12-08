package com.example.epic7_university.equipment.entity;

import com.example.epic7_university.common.entity.BaseEntity;
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
public class Equipment extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Enumerated( EnumType.STRING )
    private EquipmentParts equipmentParts;
    @Enumerated( EnumType.STRING )
    private EquipmentGrade grade;
    @Enumerated( EnumType.STRING )
    private EquipmentStat mainStat;
    @Enumerated( EnumType.STRING )
    private EquipmentSet set;
    private int enhanceValue;
    @OneToMany( mappedBy = "equipment" )
    private List<EquipmentSubStat> statList;
}
