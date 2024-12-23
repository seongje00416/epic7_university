package com.example.epic7_university.character.hero.dto.request;

import com.example.epic7_university.character.hero.dto.response.GetBaseStatResponse;
import com.example.epic7_university.character.hero.entity.BaseStat;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Get Base Stat Request", description = "기본 스탯 정보를 불러오기 위한 요청" )
public record GetBaseStatRequest(
    @Schema( description = "영웅 ID" ) Long heroId
    ) {
}
