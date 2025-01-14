package com.example.epic7_university.quiz.controller;

import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.quiz.dto.request.QuizDetailResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Tag( name = "Quiz API", description = "퀴즈 API" )
public interface QuizController {
    @Operation( summary = "퀴즈 조회", description = "퀴즈 내용 조회" )
    @ApiResponses( value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Success"
            )
    } )
    @GetMapping( "/getQuiz/{quizId}" )
    ResponseEntity<SuccessResponse<QuizDetailResponse>> getQuizDetail(
            @PathVariable Long quizId
    );
}
