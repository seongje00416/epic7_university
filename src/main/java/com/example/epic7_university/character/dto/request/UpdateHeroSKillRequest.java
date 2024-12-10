package com.example.epic7_university.character.dto.request;

import com.example.epic7_university.character.entity.SkillType;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Update Hero Skill Request", description = "영웅 스킬 정보 업데이트 요청" )
public record UpdateHeroSKillRequest(
        @Schema( description = "기술 ID" ) Long id,
        @Schema( description = "기술 이름" ) String name,
        @Schema( description = "시전 형태" ) SkillType skillType,
        @Schema( description = "보유 영웅 ID" ) Long heroID,
        @Schema( description = "스킬 번호" ) int skillNum,
        @Schema( description = "스킬 설명" ) String description,
        @Schema( description = "스킬 최대 레벨" ) int maxLevel,
        @Schema( description = "소울번 개수" ) int soulBurnCount,
        @Schema( description = "소울번 효과 설명" ) String soulBurnEffect
) {
}
