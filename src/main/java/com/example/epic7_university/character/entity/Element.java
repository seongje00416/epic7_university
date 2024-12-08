package com.example.epic7_university.character.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Element {
    FIRE( "화염" ),
    ICE( "냉기" ),
    EARTH( "자연" ),
    LIGHT( "광" ),
    DARK( "암" );

    private final String name;
}
