package com.example.epic7_university.character.exception;

import com.example.epic7_university.common.exception.ErrorCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CharacterErrorCode implements ErrorCode {
    HERO_NOT_FOUND( 404, "CE-001", "해당 영웅을 찾을 수 없습니다" );

    private final int status;
    private final String code;
    private final String message;

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public String getCode() {
        return "";
    }

    @Override
    public String getMessage() {
        return "";
    }
}
