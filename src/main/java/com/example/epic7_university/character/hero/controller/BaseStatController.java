package com.example.epic7_university.character.hero.controller;

import com.example.epic7_university.character.hero.dto.request.GetBaseStatRequest;
import com.example.epic7_university.character.hero.dto.response.GetBaseStatResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Tag( name = "Base Stat API", description = "영웅 기본 스탯 관련 API" )
public interface BaseStatController {
    @Operation( summary = "영웅 스탯 조회", description = "별자리, 직업, 태생 등급을 통한 기본 스탯 조회" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( value = "/getBaseStat" )
    ResponseEntity<SuccessResponse<GetBaseStatResponse>> getBaseStat(
            @RequestBody GetBaseStatRequest getBaseStatRequest
    );
}
