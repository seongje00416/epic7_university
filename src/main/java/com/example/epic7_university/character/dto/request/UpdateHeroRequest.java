package com.example.epic7_university.character.dto.request;

import com.example.epic7_university.character.entity.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Update Hero Information Request", description = "영웅 정보 수정 요청" )
public record UpdateHeroRequest(
        @Schema( description = "영웅 ID" ) Long id,
        @Schema( description = "영웅 이름" ) String name,
        @Schema( description = "영웅 본명" ) String realName,
        @Schema( description = "별자리" ) Constellation constellation,
        @Schema( description = "영웅 직업" ) HeroClass heroClass,
        @Schema( description = "영웅 속성" ) Element element,
        @Schema( description = "각인 해방" ) Stats imprintRelease,
        @Schema( description = "각인 해방 시작 수치" ) int irBaseValue,
        @Schema( description = "각인 해방 증가 수치" ) int irUpValue,
        @Schema( description = "각인 집중" ) Stats imprintConcentration,
        @Schema( description = "각인 집중 시작 수치" ) int icBaseValue,
        @Schema( description = "각인 집중 증가 수치" ) int icUpValue,
        @Schema( description = "태생 등급" ) int birthGrade,
        @Schema( description = "획득 방법" ) GetType getType,
        @Schema( description = "주 사용 스탯" ) Stats mainStats
) {
}
