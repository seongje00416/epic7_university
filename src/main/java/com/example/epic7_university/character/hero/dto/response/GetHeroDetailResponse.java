package com.example.epic7_university.character.hero.dto.response;

import com.example.epic7_university.character.hero.entity.Constellation;
import com.example.epic7_university.character.hero.entity.Hero;
import com.example.epic7_university.character.hero.entity.HeroClass;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name="Hero Detail Response", description = "영웅 상세 조회 응답" )
public record GetHeroDetailResponse(
        @Schema( description = "영웅 ID" ) Long id,
        @Schema( description = "영웅 이름" ) String name,
        @Schema( description = "영웅 태생 등급" ) int grade,
        @Schema( description = "각인 해방 스탯" ) String imprintRelease,
        @Schema( description = "각인 해방 증가율" ) float irIncrease,
        @Schema( description = "각인 해방 기본값" ) float irBase,
        @Schema( description = "각인 집중 스탯" ) String imprintConcentration,
        @Schema( description = "각인 집중 증가율" ) float icIncrease,
        @Schema( description = "각인 집중 기본값" ) float icBase,
        @Schema( description = "영웅 스탠딩 일러스트" ) String imageURL,
        @Schema( description = "영웅 직업" ) HeroClass heroClass,
        @Schema( description = "영웅 별자리" ) Constellation constellation
        ) {
    public static GetHeroDetailResponse of( Hero hero ) {
        return GetHeroDetailResponse.builder()
                .id( hero.getId() )
                .name( hero.getName() )
                .grade( hero.getGrade() )
                .imprintRelease( hero.getImprintRelease() )
                .irIncrease( hero.getIrIncrease() )
                .irBase( hero.getIrBase() )
                .imprintConcentration( hero.getImprintConcentration() )
                .icIncrease( hero.getIcIncrease() )
                .icBase( hero.getIcBase() )
                .imageURL( hero.getImageURL() )
                .heroClass( hero.getHeroClass() )
                .constellation( hero.getConstellation() )
                .build();
    }
}
