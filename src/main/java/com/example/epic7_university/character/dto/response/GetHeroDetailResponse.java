package com.example.epic7_university.character.dto.response;

import com.example.epic7_university.character.entity.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import java.util.List;

@Builder
@Schema( name = "Hero Detail Response", description = "영웅 상세 조회 응답" )
public record GetHeroDetailResponse(
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
        @Schema( description = "주 사용 스탯" ) Stats mainStats,
        @Schema( description = "보유 스킬" ) List<Skill> skillList
) {
    public static GetHeroDetailResponse of( Hero hero ){
        GetHeroDetailResponseBuilder builder = GetHeroDetailResponse.builder()
                .id( hero.getId() )
                .name( hero.getName() )
                .realName( hero.getRealName() )
                .constellation( hero.getConstellation() )
                .heroClass( hero.getHeroClass() )
                .element( hero.getElement() )
                .imprintRelease( hero.getImprintRelease() )
                .irBaseValue( hero.getIrBaseValue() )
                .irUpValue( hero.getIrUpValue())
                .imprintConcentration( hero.getImprintConcentration() )
                .icBaseValue( hero.getIcBaseValue() )
                .icBaseValue( hero.getIcBaseValue() )
                .birthGrade( hero.getBirthGrade() )
                .getType( hero.getGetType() )
                .mainStats( hero.getMainStats() );
        builder.skillList.addAll(hero.getSkill());
        return builder.build();
    }
}
