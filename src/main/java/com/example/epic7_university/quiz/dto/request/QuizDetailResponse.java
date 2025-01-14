package com.example.epic7_university.quiz.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Quiz Detail Response", description = "퀴즈 상세 조회 응답" )
public record QuizDetailResponse(
        @Schema( description = "퀴즈 ID" ) Long id,
) {
}
