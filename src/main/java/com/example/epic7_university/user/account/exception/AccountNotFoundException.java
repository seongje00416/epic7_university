package com.example.epic7_university.user.account.exception;

import com.example.epic7_university.common.exception.CustomException;

public class AccountNotFoundException extends CustomException {
    public AccountNotFoundException(){
        super( AccountErrorCode.ACCOUNT_NOT_FOUND );
    }
}
