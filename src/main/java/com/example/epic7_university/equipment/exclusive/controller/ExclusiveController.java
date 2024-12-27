package com.example.epic7_university.equipment.exclusive.controller;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.equipment.exclusive.dto.response.GetAllHeroExclusiveResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Tag( name = "Exclusive Equipment API", description = "영웅 전용 장비 관련 API" )
public interface ExclusiveController {
    @Operation( summary = "Get All Hero Exclusive Equipment", description = "해당 영웅의 전용 장비 목록 조회 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( "/api/v1/getExclusiveList/{heroId}")
    ResponseEntity<SuccessResponse<PageResponse<GetAllHeroExclusiveResponse>>> getAllHeroExclusiveList(
            @PathVariable Long heroId
    );
}
