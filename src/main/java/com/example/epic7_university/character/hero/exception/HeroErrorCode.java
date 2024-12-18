package com.example.epic7_university.character.hero.exception;

import com.example.epic7_university.common.exception.ErrorCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum HeroErrorCode implements ErrorCode {
    HERO_NOT_FOUND( 404, "HE-0001", "Hero Not Found" ),
    BASE_STAT_NOT_FOUND( 404, "BE-0001", "Base Stat Not Found" );

    private final int status;
    private final String code;
    private final String message;
    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
