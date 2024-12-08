package com.example.epic7_university.equipment.entity;

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
public class EquipmentSubStat extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @ManyToOne
    @JoinColumn( name = "equipment_id" )
    private Equipment equipment;
    @Enumerated( EnumType.STRING )
    private EquipmentStat stat;
    private int statValue;
}
