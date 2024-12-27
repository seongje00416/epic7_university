package com.example.epic7_university.equipment.artifact.controller;

import com.example.epic7_university.character.hero.dto.response.GetAllHeroResponse;
import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.equipment.artifact.dto.response.GetAllArtifactResponse;
import com.example.epic7_university.equipment.artifact.dto.response.GetArtifactDetailResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Tag( name = "Artifact API", description = "아티팩트 관련 API" )
public interface ArtifactController {
    @Operation( summary = "아티팩트 전체 조회", description = "아티팩트 전체 조회 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( value = "/getAllArtifacts")
    ResponseEntity<SuccessResponse<PageResponse<GetAllArtifactResponse>>> getAllArtifacts(
            @RequestParam( value="size", required = false, defaultValue = "10" ) int size,
            @RequestParam( value="page", required = false, defaultValue = "0" ) int page
    );

    @Operation( summary = "아티팩트 상세 조회", description = "아티팩트 상세 조회 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( value = "/getArtifactDetail/{artifactId}")
    ResponseEntity<SuccessResponse<GetArtifactDetailResponse>> getArtifactDetail(
            @PathVariable Long artifactId
    );
}
