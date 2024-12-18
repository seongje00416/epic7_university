package com.example.epic7_university.character.hero.exception;

import com.example.epic7_university.common.exception.CustomException;

public class HeroNotFoundException extends CustomException {
    public HeroNotFoundException() { super( HeroErrorCode.HERO_NOT_FOUND ); }
}
