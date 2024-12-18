package com.example.epic7_university.character.hero.dto.request;

import com.example.epic7_university.character.hero.dto.response.GetBaseStatResponse;
import com.example.epic7_university.character.hero.entity.BaseStat;
import com.example.epic7_university.character.hero.entity.Constellation;
import com.example.epic7_university.character.hero.entity.HeroClass;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Get Base Stat Request", description = "기본 스탯 정보를 불러오기 위한 요청" )
public record GetBaseStatRequest(
    @Schema( description = "별자리", requiredMode = Schema.RequiredMode.REQUIRED, implementation = Constellation.class )Constellation constellation,
        @Schema( description = "태생 등급", requiredMode = Schema.RequiredMode.REQUIRED ) int grade,
        @Schema( description = "직업", requiredMode = Schema.RequiredMode.REQUIRED, implementation = HeroClass.class ) HeroClass heroClass
        ) {
    public static GetBaseStatResponse of(BaseStat baseStat){
        return GetBaseStatResponse.builder()
                .attack(baseStat.getAttack() )
                .defense(baseStat.getDefense() )
                .health(baseStat.getHealth() )
                .speed(baseStat.getSpeed() )
                .criticalHitChance(baseStat.getCriticalHitChance() )
                .criticalHitDamage(baseStat.getCriticalHitDamage() )
                .effectiveness(baseStat.getEffectiveness() )
                .effectResistance(baseStat.getEffectResistance() )
                .dualAttackChance(baseStat.getDualAttackChance() )
                .build();
    }
}
