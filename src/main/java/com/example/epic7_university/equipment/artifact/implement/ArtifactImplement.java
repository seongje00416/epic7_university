package com.example.epic7_university.equipment.artifact.implement;

import com.example.epic7_university.equipment.artifact.controller.ArtifactController;
import com.example.epic7_university.equipment.artifact.service.ArtifactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/api/v1/artifact" )
public class ArtifactImplement implements ArtifactController {
    private final ArtifactService artifactService;
}
