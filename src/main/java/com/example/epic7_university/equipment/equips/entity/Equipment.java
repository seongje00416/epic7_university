package com.example.epic7_university.equipment.equips.entity;

import com.example.epic7_university.common.entity.BaseEntity;
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
public class Equipment extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Enumerated( EnumType.STRING )
    private EquipParts parts;
    @Enumerated( EnumType.STRING )
    private EquipSetEffect setEffect;
    private int enhance;
    @Enumerated( EnumType.STRING )
    private EquipGrade grade;
    @Enumerated( EnumType.STRING )
    private EquipLevel level;
    @Enumerated( EnumType.STRING )
    private EquipOption mainOption;
    private int mainValue;
    @Enumerated( EnumType.STRING )
    private EquipOption subOption1;
    private int subValue1;
    @Enumerated( EnumType.STRING )
    private EquipOption subOption2;
    private int subValue2;
    @Enumerated( EnumType.STRING )
    private EquipOption subOption3;
    private int subValue3;
    @Enumerated( EnumType.STRING )
    private EquipOption subOption4;
    private int subValue4;

    public Equipment(
            Long id,
            EquipParts parts,
            EquipSetEffect setEffect,
            int enhance,
            EquipGrade grade,
            EquipLevel level,
            EquipOption mainOption,
            int mainValue,
            EquipOption subOption1,
            int subValue1,
            EquipOption subOption2,
            int subValue2,
            EquipOption subOption3,
            int subValue3,
            EquipOption subOption4,
            int subValue4
    ){
        this.id = id;
        this.parts = parts;
        this.setEffect = setEffect;
        this.enhance = enhance;
        this.grade = grade;
        this.level = level;
        this.mainOption = mainOption;
        this.mainValue = mainValue;
        this.subOption1 = subOption1;
        this.subValue1 = subValue1;
        this.subOption2 = subOption2;
        this.subValue2 = subValue2;
        this.subOption3 = subOption3;
        this.subValue3 = subValue3;
        this.subOption4 = subOption4;
        this.subValue4 = subValue4;
    }
}
