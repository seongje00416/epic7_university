package com.example.epic7_university.character.hero.dto.response;

import com.example.epic7_university.character.hero.entity.Hero;
import com.example.epic7_university.character.hero.entity.HeroClass;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get All Hero Response", description = "영웅 전체 조회 응답" )
public record GetAllHeroResponse(
        @Schema( description = "영웅 ID" ) Long id,
        @Schema( description = "영웅 이름" ) String name,
        @Schema( description = "영웅 등급" ) int grade,
        @Schema( description = "영웅 직업" ) HeroClass heroClass
) {
    public static GetAllHeroResponse of( Hero hero ){
        return GetAllHeroResponse.builder()
                .id( hero.getId() )
                .name( hero.getName() )
                .grade( hero.getGrade() )
                .heroClass( hero.getHeroClass() )
                .build();
    }
}
