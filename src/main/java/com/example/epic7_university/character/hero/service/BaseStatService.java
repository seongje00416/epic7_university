package com.example.epic7_university.character.hero.service;

import com.example.epic7_university.character.hero.dto.request.GetBaseStatRequest;
import com.example.epic7_university.character.hero.dto.response.GetBaseStatResponse;
import com.example.epic7_university.character.hero.entity.BaseStat;
import com.example.epic7_university.character.hero.exception.BaseStatNotFoundException;
import com.example.epic7_university.character.hero.repository.BaseStatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BaseStatService {
    private final BaseStatRepository baseStatRepository;

    public GetBaseStatResponse getBaseStat(GetBaseStatRequest getBaseStatRequest ){
        BaseStat baseStat = baseStatRepository
                .findBaseStatByConstellationAndHeroClassAndGrade( getBaseStatRequest.constellation(), getBaseStatRequest.heroClass(), getBaseStatRequest.grade() )
                .orElseThrow(BaseStatNotFoundException::new);
        return GetBaseStatResponse.of( baseStat );
    }
}
