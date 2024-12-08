package com.example.epic7_university.character.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ImprintType {
    RELEASE( "해방" ),
    CONCENTRATION( "집중" );

    private final String message;
}
