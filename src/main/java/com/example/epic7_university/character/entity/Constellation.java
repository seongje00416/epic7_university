package com.example.epic7_university.character.entity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Constellation {
    CANCER( "거해궁" ),
    TAURUS( "금우궁" ),
    CAPRICORN( "마갈궁" ),
    ARIES( "백양궁" ),
    AQUARIUS( "보병궁" ),
    LEO( "사자궁" ),
    GEMINI( "쌍아궁" ),
    PISCES( "쌍어궁" ),
    SAGITTARIUS( "인마궁" ),
    VIRGO( "처녀궁" ),
    SCORPIO( "천갈궁" ),
    LIBRA( "천칭궁" );

    private final String name;
}
