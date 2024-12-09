package com.example.epic7_university.user.equipment.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EquipmentGrade {
    HEROIC( "전설" ),
    EPIC( "영웅" ),
    RARE( "희귀" ),
    NORMAL( ""),
    COMMON( "일반" );

    private final String name;
}
