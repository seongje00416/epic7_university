package com.example.epic7_university.user.account.exception;

import com.example.epic7_university.common.exception.ErrorCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum AccountErrorCode implements ErrorCode {
    ACCOUNT_NOT_FOUND( 404, "AE-001", "해당 계정 정보를 찾을 수 없습니다."),
    HEIR_NOT_FOUND( 404, "HE-001", "해당 계승자 정보를 찾을 수 없습니다.");

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
