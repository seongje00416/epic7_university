package com.example.epic7_university.v2.controller;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.v2.dto.request.GetHeroListRequest;
import com.example.epic7_university.v2.dto.response.GetHeroListResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Tag( name = "Hero Information API", description = "영웅 관련 API" )
public interface HeroController {
    @Operation( summary = "Load Hero List", description = "영웅 목록 조회 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Load Success"
            )
    })
    @GetMapping( value = "/getHeroList" )
    ResponseEntity<SuccessResponse<PageResponse<GetHeroListResponse>>> getHeroList(
        @RequestParam( value = "size", required = false, defaultValue = "20" ) int size,
        @RequestParam( value = "page", required = false, defaultValue = "0" ) int page,
        @RequestBody GetHeroListRequest getHeroListRequest
    );
}
