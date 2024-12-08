package com.example.epic7_university.character.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum GetType {
    COMMON( "성약" ),
    LIMITED( "한정' "),
    COLLABORATION( "콜라보" ),
    MOONLIGHT( "월광" );

    private final String type;
}
