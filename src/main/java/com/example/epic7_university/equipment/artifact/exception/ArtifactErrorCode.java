package com.example.epic7_university.equipment.artifact.exception;

import com.example.epic7_university.common.exception.ErrorCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ArtifactErrorCode implements ErrorCode {
    ARTIFACT_NOT_FOUND( 404, "AE-001", "아티팩트를 찾을 수 없습니다" );

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
