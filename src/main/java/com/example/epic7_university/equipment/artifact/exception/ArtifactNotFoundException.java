package com.example.epic7_university.equipment.artifact.exception;

import com.example.epic7_university.common.exception.CustomException;

public class ArtifactNotFoundException extends CustomException {
    public ArtifactNotFoundException() { super( ArtifactErrorCode.ARTIFACT_NOT_FOUND); }
}
