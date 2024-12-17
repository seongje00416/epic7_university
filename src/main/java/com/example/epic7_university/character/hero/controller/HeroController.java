package com.example.epic7_university.character.hero.controller;

import com.example.epic7_university.character.hero.dto.response.GetAllHeroResponse;
import com.example.epic7_university.character.hero.dto.response.GetHeroDetailResponse;
import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Tag( name = "Hero API", description = "영웅 API" )
public interface HeroController {
    @Operation( summary = "영웅 상세 조회", description = "영웅 상세 조회 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( value = "/getHero/{heroId}" )
    ResponseEntity<SuccessResponse<GetHeroDetailResponse>> getHeroDetail(
            @RequestParam Long heroId
    );

    @Operation( summary = "영웅 전체 조회", description = "영웅 전체 조회 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "조회 성공"
            )
    })
    @GetMapping( value = "/getAllHero" )
    ResponseEntity<SuccessResponse<PageResponse<GetAllHeroResponse>>> getAllHero();
}
