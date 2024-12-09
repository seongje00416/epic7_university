package com.example.epic7_university.character.dto.response;

import com.example.epic7_university.character.entity.Element;
import com.example.epic7_university.character.entity.Hero;
import com.example.epic7_university.character.entity.HeroClass;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Hero List Response", description = "영웅 목록 조회 응답" )
public record GetAllHerosResponse(
        @Schema( description = "영웅 ID" ) Long id,
        @Schema( description = "영웅 이름" ) String name,
        @Schema( description = "영웅 속성" ) Element element,
        @Schema( description = "영웅 직업" ) HeroClass heroClass
) {
    public static GetAllHerosResponse of ( Hero hero ){
        return GetAllHerosResponse.builder()
                .id( hero.getId() )
                .name( hero.getName() )
                .element( hero.getElement() )
                .heroClass( hero.getHeroClass() )
                .build();
    }
}
