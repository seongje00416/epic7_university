package com.example.epic7_university.character.utils;

public class StatValidation {
    public boolean criticalHitChanceValidate( int input ){
        // 최대 100
        if( input > 100 ) return false;
        return true;
    }
    public boolean criticalHitDamageValidate( int input ){
        // 최대 350
        if( input > 350 ) return false;
        return true;
    }
    public boolean basicValidate( int input ){
        // 음수인지 확인
        if( input < 0 ) return false;
        return true;
    }
}
