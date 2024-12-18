package com.example.epic7_university.character.hero.implement;

import com.example.epic7_university.character.hero.controller.HeroController;
import com.example.epic7_university.character.hero.dto.response.GetAllHeroResponse;
import com.example.epic7_university.character.hero.dto.response.GetHeroDetailResponse;
import com.example.epic7_university.character.hero.service.HeroService;
import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/api/v1/hero" )
public class HeroImplement implements HeroController {
    private final HeroService heroService;
    @Override
    public ResponseEntity<SuccessResponse<GetHeroDetailResponse>> getHeroDetail(Long heroId) {
        GetHeroDetailResponse getHeroDetailResponse = heroService.getHeroDetail( heroId );
        return SuccessResponse.of( getHeroDetailResponse ).asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<PageResponse<GetAllHeroResponse>>> getAllHero(
            @RequestParam( value="size", required = false, defaultValue = "10" ) int size,
            @RequestParam( value="page", required = false, defaultValue = "0" ) int page
    ) {
        PageRequest pageRequest = PageRequest.of( page, size );
        return SuccessResponse.of( heroService.getAllHero( pageRequest ) ).asHttp(HttpStatus.OK);
    }
}
