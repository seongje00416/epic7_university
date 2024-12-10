package com.example.epic7_university.user.account.controller;

import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.user.account.dto.SignUpRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Tag( name = "Account Controller", description = "계정 정보 API" )
public interface AccountController {
    @Operation( summary = "로그인", description = "로그인을 위한 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "로그인 성공"
            )
    })
    @PostMapping( value = "/login" )
    ResponseEntity<SuccessResponse<Long>> login (
            @RequestParam String email,
            @RequestParam String password
    );

    @Operation( summary = "회원가입", description = "회원가입을 위한 API" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "회원가입 성공"
            )
    })
    @PostMapping( value = "/signUp" )
    ResponseEntity<SuccessResponse<Void>> signUp(
            @RequestBody SignUpRequest signUpRequest
    );
}
