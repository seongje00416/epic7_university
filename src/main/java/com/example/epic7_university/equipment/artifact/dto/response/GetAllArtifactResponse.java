package com.example.epic7_university.equipment.artifact.dto.response;

import com.example.epic7_university.equipment.artifact.entity.Artifact;
import com.example.epic7_university.equipment.artifact.entity.UseClass;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get All Artifact Response", description = "아티팩트 전체 조회 응답" )
public record GetAllArtifactResponse(
        @Schema( description = "아티팩트 ID" ) Long id,
        @Schema( description = "아티팩트 이름" ) String name,
        @Schema( description = "아티팩트 직업군" ) UseClass useClass,
        @Schema( description = "아티팩트 등급" ) int birthGrade
) {
    public static GetAllArtifactResponse of ( Artifact artifact ) {
        return GetAllArtifactResponse.builder()
                .id( artifact.getId() )
                .name(artifact.getName() )
                .useClass( artifact.getUseClass() )
                .birthGrade(artifact.getBirthGrade() )
                .build();
    }
}
