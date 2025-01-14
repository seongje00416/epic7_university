package com.example.epic7_university.v2.dto.request;

import com.example.epic7_university.v2.entity.type.HeroClass;
import com.example.epic7_university.v2.entity.type.HeroElement;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Get Hero List Request", description = "영웅 목록 조회 요청" )
public record GetHeroListRequest(
        @Schema( description = "영웅 속성", requiredMode = Schema.RequiredMode.REQUIRED, implementation = HeroElement.class ) HeroElement element,
        @Schema( description = "영웅 직업", requiredMode = Schema.RequiredMode.REQUIRED, implementation = HeroClass.class ) HeroClass heroClass,
        @Schema( description = "영웅 등급", requiredMode = Schema.RequiredMode.REQUIRED ) int grade
) {
}
