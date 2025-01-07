package com.example.epic7_university.v2.dto.response;

import com.example.epic7_university.v2.entity.Hero;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get Hero List Response", description = "영웅 목록 조회 응답" )
public record GetHeroListResponse(
        @Schema( description = "영웅 ID" ) Long id,
        @Schema( description = "영웅 이름" ) String name
        ) {
    public static GetHeroListResponse of( Hero hero ){
        return GetHeroListResponse.builder()
                .id( hero.getId() )
                .name( hero.getName() ).build();
    }
}
