package com.example.epic7_university.v2.implement;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.v2.controller.HeroController;
import com.example.epic7_university.v2.dto.request.GetHeroListRequest;
import com.example.epic7_university.v2.dto.response.GetHeroListResponse;
import com.example.epic7_university.v2.service.HeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v2/hero" )
@RequiredArgsConstructor
public class HeroImplement implements HeroController {

    private final HeroService heroService;

    @Override
    public ResponseEntity<SuccessResponse<PageResponse<GetHeroListResponse>>> getHeroList(int size, int page, GetHeroListRequest getHeroListRequest) {
        PageRequest pageRequest = PageRequest.of( page, size );
        return SuccessResponse.of( heroService.getHeroList( pageRequest, getHeroListRequest ) ).asHttp(HttpStatus.OK );
    }
}
