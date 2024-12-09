package com.example.epic7_university.common.exception;

import java.io.Serializable;

public interface ErrorCode  extends Serializable {
    int getStatus();

    String getCode();

    String getMessage();
}