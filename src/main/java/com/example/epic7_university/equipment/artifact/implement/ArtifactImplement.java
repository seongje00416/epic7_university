package com.example.epic7_university.equipment.artifact.implement;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.equipment.artifact.controller.ArtifactController;
import com.example.epic7_university.equipment.artifact.dto.response.GetAllArtifactResponse;
import com.example.epic7_university.equipment.artifact.service.ArtifactService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/api/v1/artifact" )
public class ArtifactImplement implements ArtifactController {
    private final ArtifactService artifactService;

    @Override
    public ResponseEntity<SuccessResponse<PageResponse<GetAllArtifactResponse>>> getAllArtifacts(int size, int page) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return SuccessResponse.of( artifactService.getAllArtifact( pageRequest ) ).asHttp( HttpStatus.OK );
    }
}
