package com.example.epic7_university.v2.service;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.utils.PageUtils;
import com.example.epic7_university.v2.dto.request.GetHeroListRequest;
import com.example.epic7_university.v2.dto.response.GetHeroListResponse;
import com.example.epic7_university.v2.entity.type.HeroClass;
import com.example.epic7_university.v2.entity.type.HeroElement;
import com.example.epic7_university.v2.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeroService {

    private final HeroRepository heroRepository;

    public PageResponse<GetHeroListResponse> getHeroList(PageRequest pageRequest, GetHeroListRequest getHeroListRequest ) {
        int grade = getHeroListRequest.grade();
        HeroClass heroClass = getHeroListRequest.heroClass();
        HeroElement element = getHeroListRequest.element();
        if( grade != 0 && heroClass != null && element != null ) return PageUtils.toPageResponse( heroRepository.findAllByGradeAndHeroClassAndElement( pageRequest, grade, heroClass, element ) ).map( GetHeroListResponse::of);
        if( grade != 0 && heroClass == null && element != null ) return PageUtils.toPageResponse( heroRepository.findAllByGradeAndElement( pageRequest, grade, element ) ).map( GetHeroListResponse::of);
        if( grade != 0 && heroClass != null && element == null ) return PageUtils.toPageResponse( heroRepository.findAllByGradeAndHeroClass( pageRequest, grade, heroClass ) ).map( GetHeroListResponse::of);
        if( grade == 0 && heroClass != null && element != null ) return PageUtils.toPageResponse( heroRepository.findAllByHeroClass( pageRequest, heroClass ) ).map( GetHeroListResponse::of);
        if( grade == 0 && heroClass == null && element != null ) return PageUtils.toPageResponse( heroRepository.findAllByElement( pageRequest, element ) ).map( GetHeroListResponse::of);
        return PageUtils.toPageResponse( heroRepository.findAll( pageRequest ) ).map(GetHeroListResponse::of);
    }
}
