package com.example.epic7_university.character.controller;

import com.example.epic7_university.character.dto.request.AddNewHeroRequest;
import com.example.epic7_university.character.dto.request.AddNewHeroSkillRequest;
import com.example.epic7_university.character.dto.response.GetAllHerosResponse;
import com.example.epic7_university.character.dto.response.GetHeroDetailResponse;
import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Tag( name = "Character Controller", description = "영웅 캐릭터 API" )
public interface CharacterController {
    @Operation( summary = "영웅 전체 조회", description = "영웅 전체 조회를 위한 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "성공적으로 조회했습니다"
            )
    })
    @GetMapping( value = "/getAllHero" )
    ResponseEntity<SuccessResponse<PageResponse<GetAllHerosResponse>>> getAllHero(
            @RequestParam(value = "size", required = false, defaultValue = "20") int size,
            @RequestParam(value = "page", required = false, defaultValue = "0") int page
    );

    @Operation( summary = "영웅 상세 조회", description = "영웅 상제 정보 조회를 위한 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "성공적으로 조회했습니다."
            )
    })
    @GetMapping( value = "/getHeroDetail/{:id}" )
    ResponseEntity<SuccessResponse<GetHeroDetailResponse>> getHeroDetail(
            @RequestParam( value = "heroID", required = false ) Long heroID
    );

    @Operation( summary = "신규 영웅 정보 등록", description = "신규 영웅 정보 등록을 위한 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "성공적으로 추가했습니다"
            )
    })
    @PostMapping( value = "/addNewHero/information" )
    ResponseEntity<SuccessResponse<Long>> addNewHero(
            @RequestBody AddNewHeroRequest addNewHeroRequest
    );

    @Operation( summary = "신규 영웅 스킬 정보 등록", description = "신규 영웅 스킬 정보 등록을 위한 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "성공적으로 추가했습니다"
            )
    })
    @PostMapping( value = "/addNewHero/skill" )
    ResponseEntity<SuccessResponse<Void>> addNewHeroSkill(
            @RequestBody AddNewHeroSkillRequest addNewHeroSkillRequest
    );
}
