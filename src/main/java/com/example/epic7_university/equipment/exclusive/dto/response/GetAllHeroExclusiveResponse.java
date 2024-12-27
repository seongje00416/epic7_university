package com.example.epic7_university.equipment.exclusive.dto.response;

import com.example.epic7_university.equipment.exclusive.entity.ExclusiveEquipment;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get All Hero's Exclusive Equipment Response", description = "해당 영웅의 전용장비 목록 응답 API")
public record GetAllHeroExclusiveResponse(
        @Schema( description = "전용장비 ID" ) Long id,
        @Schema( description = "강화 스킬 번호" ) int skillNumber,
        @Schema( description = "스킬 강화 내용" ) String description
) {
    public static GetAllHeroExclusiveResponse of(ExclusiveEquipment exclusiveEquipment) {
        return GetAllHeroExclusiveResponse.builder()
                .id( exclusiveEquipment.getId() )
                .skillNumber(exclusiveEquipment.getSkillNum() )
                .description(exclusiveEquipment.getDescription())
                .build();
    }
}
