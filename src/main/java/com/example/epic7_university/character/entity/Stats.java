package com.example.epic7_university.character.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Stats {
    ATTACK( "공격력", 0, 1000 ),
    DEFENSE( "방어력", 0, 1000 ),
    HEALTH( "생명력", 0, 10000 ),
    SPEED( "속도", 0, 30 ),
    CRITICAL_HIT_CHANCE( "치명확률", 0, 30 ),
    CRITICAL_HIT_DAMAGE( "치명피해", 0, 50 ),
    EFFECTIVENESS( "효과적중", 0, 100 ),
    EFFECT_RESISTANCE( "효과저항", 0, 100 ),
    DUAL_ATTACK_CHANCE( "협공확률", 0, 100 );

    private final String name;
    private final int minValue;
    private final int maxValue;
}
