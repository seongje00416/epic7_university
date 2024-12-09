package com.example.epic7_university.user.equipment.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum EquipmentStat {
    ATTACK( "공격력" ),
    ATTACK_PER( "공격력(%)" ),
    DEFENSE( "방어력" ),
    DEFENSE_PER( "방어력(%)" ),
    HEALTH( "생명력" ),
    HEALTH_PER( "생명력(%)" ),
    SPEED( "속도" ),
    CRITICAL_HIT_CHANCE( "치명확률" ),
    CRITICAL_HIT_DAMAGE( "치명피해" ),
    EFFECTIVENESS( "효과적중" ),
    EFFECT_RESISTANCE( "효과저항" );
    private final String name;
}
