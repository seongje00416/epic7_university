package com.example.epic7_university.character.hero.service;

import com.example.epic7_university.character.hero.dto.response.GetAllHeroResponse;
import com.example.epic7_university.character.hero.dto.response.GetHeroDetailResponse;
import com.example.epic7_university.character.hero.entity.Hero;
import com.example.epic7_university.character.hero.exception.HeroNotFoundException;
import com.example.epic7_university.character.hero.repository.HeroRepository;
import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.utils.PageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeroService {
    private final HeroRepository heroRepository;

    public GetHeroDetailResponse getHeroDetail( Long heroId ){
        Hero hero = heroRepository.findById( heroId ).orElseThrow( HeroNotFoundException::new );
        return GetHeroDetailResponse.of( hero );
    }

    public PageResponse<GetAllHeroResponse> getAllHero( PageRequest pageRequest ){
        return PageUtils.toPageResponse( heroRepository.findAll( pageRequest ).map(
                hero -> GetAllHeroResponse.of( hero )
        ));
    }
}
