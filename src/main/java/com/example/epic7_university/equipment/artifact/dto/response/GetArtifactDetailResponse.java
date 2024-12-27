package com.example.epic7_university.equipment.artifact.dto.response;

import com.example.epic7_university.equipment.artifact.entity.Artifact;
import com.example.epic7_university.equipment.artifact.entity.UseClass;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get Artifact Detail API", description = "아티팩트 상세 정보 조회 응답" )
public record GetArtifactDetailResponse(
        @Schema( description = "아티팩트 ID" ) Long id,
        @Schema( description = "아티팩트 이름" ) String name,
        @Schema( description = "아티팩트 등급" ) int birthGrade,
        @Schema( description = "아티팩트 사용 직업군" ) UseClass useClass,
        @Schema( description = "공격력 능력치" ) int attack,
        @Schema( description = "생명력 능력치" ) int health
) {
    public static GetArtifactDetailResponse of( Artifact artifact ) {
        return GetArtifactDetailResponse.builder()
                .id(artifact.getId() )
                .name(artifact.getName())
                .birthGrade(artifact.getBirthGrade())
                .useClass(artifact.getUseClass())
                .attack(artifact.getAttack())
                .health( artifact.getHealth() )
                .build();
    }
}
