package com.example.epic7_university.character.exception;

import com.example.epic7_university.common.exception.CustomException;

public class SkillNotFoundException extends CustomException {
    public SkillNotFoundException() {
        super( CharacterErrorCode.SKILL_NOT_FOUND );
    }
}
