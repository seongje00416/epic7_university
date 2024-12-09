package com.example.epic7_university.character.service;

import com.example.epic7_university.character.dto.response.GetAllHerosResponse;
import com.example.epic7_university.character.dto.response.GetHeroDetailResponse;
import com.example.epic7_university.character.repository.CharacterRepository;
import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.utils.PageUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CharacterService {

    private final CharacterRepository characterRepository;

    public PageResponse<GetAllHerosResponse> getAllHeros( PageRequest pageRequest) {
        return PageUtils.toPageResponse( characterRepository.findAll( pageRequest ) )
                .map( GetAllHerosResponse::of );
    }

    public GetHeroDetailResponse getHeroDetail( Long id) {
        return GetHeroDetailResponse.of( characterRepository.findById(id) );
    }
}
