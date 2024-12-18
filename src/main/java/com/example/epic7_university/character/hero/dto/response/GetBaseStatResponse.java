package com.example.epic7_university.character.hero.dto.response;

import com.example.epic7_university.character.hero.entity.BaseStat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema( name = "Get Base Stat Response", description = "별자리, 태생 등급, 직업에 따른 기본 스탯" )
public record GetBaseStatResponse(
        @Schema( description = "엔티티 ID" ) Long id,
        @Schema( description = "공격력" ) int attack,
        @Schema( description = "방어력" ) int defense,
        @Schema( description = "생명력" ) int health,
        @Schema( description = "속도" ) int speed,
        @Schema( description = "치명확률" ) int criticalHitChance,
        @Schema( description = "치명피해" ) int criticalHitDamage,
        @Schema( description = "효과적중" ) int effectiveness,
        @Schema( description = "효과저항" ) int effectResistance,
        @Schema( description = "협공확률" ) int dualAttackChance
) {
    public static GetBaseStatResponse of( BaseStat baseStat ){
        return GetBaseStatResponse.builder()
                .id(baseStat.getId() )
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
