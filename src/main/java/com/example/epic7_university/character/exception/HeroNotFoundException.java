package com.example.epic7_university.character.exception;

import com.example.epic7_university.common.exception.CustomException;

public class HeroNotFoundException extends CustomException {
    public HeroNotFoundException() {
        super( CharacterErrorCode.HERO_NOT_FOUND);
    }
}
