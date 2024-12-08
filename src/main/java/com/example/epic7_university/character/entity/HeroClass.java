package com.example.epic7_university.character.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum HeroClass {
    WARRIOR( "전사" ),
    KNIGHT( "기사" ),
    THIEF( "도적" ),
    RANGER( "사수" ),
    MAGE( "마도사" ),
    SOUL_WEAVER( "정령사" );

    private final String name;
}
