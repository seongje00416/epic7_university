package com.example.epic7_university.character.hero.exception;

import com.example.epic7_university.common.exception.CustomException;

public class BaseStatNotFoundException extends CustomException {
    public BaseStatNotFoundException() { super( HeroErrorCode.BASE_STAT_NOT_FOUND ); }
}
