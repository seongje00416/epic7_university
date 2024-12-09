package com.example.epic7_university.character.implementation;

import com.example.epic7_university.character.controller.CharacterController;
import com.example.epic7_university.character.dto.response.GetAllHerosResponse;
import com.example.epic7_university.character.service.CharacterService;
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
@RequestMapping( "/api/v1/character" )
@RequiredArgsConstructor
public class CharacterImpl implements CharacterController {

    private final CharacterService characterService;
    @Override
    public ResponseEntity<SuccessResponse<PageResponse<GetAllHerosResponse>>> getAllHero(
            @RequestParam( value = "size", required = false, defaultValue = "20" ) int size,
            @RequestParam( value = "page", required = false, defaultValue = "0" ) int page
    ) {
        PageRequest pageRequest = PageRequest.of(0, 10);
        return SuccessResponse.of( characterService.getAllHeros( pageRequest ) ).asHttp( HttpStatus.OK );
    }
}
