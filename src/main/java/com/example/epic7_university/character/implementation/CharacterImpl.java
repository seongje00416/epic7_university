package com.example.epic7_university.character.implementation;

import com.example.epic7_university.character.controller.CharacterController;
import com.example.epic7_university.character.dto.request.AddNewHeroRequest;
import com.example.epic7_university.character.dto.request.AddNewHeroSkillRequest;
import com.example.epic7_university.character.dto.request.UpdateHeroRequest;
import com.example.epic7_university.character.dto.request.UpdateHeroSKillRequest;
import com.example.epic7_university.character.dto.response.GetAllHerosResponse;
import com.example.epic7_university.character.dto.response.GetHeroDetailResponse;
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

    @Override
    public ResponseEntity<SuccessResponse<GetHeroDetailResponse>> getHeroDetail(Long heroID) {
        return SuccessResponse.of( characterService.getHeroDetail( heroID ) ).asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<Long>> addNewHero(AddNewHeroRequest addNewHeroRequest) {
        return SuccessResponse.of( characterService.addHeroInformation( addNewHeroRequest ) ).asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> addNewHeroSkill(AddNewHeroSkillRequest addNewHeroSkillRequest ) {
        characterService.addHeroSkill( addNewHeroSkillRequest );
        return SuccessResponse.ofNoData().asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> updateHero(UpdateHeroRequest updateHeroRequest) {
        characterService.updateHero( updateHeroRequest );
        return SuccessResponse.ofNoData().asHttp( HttpStatus.OK );
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> updateHeroSkill(UpdateHeroSKillRequest updateHeroSKillRequest) {
        characterService.updateHeroSkill( updateHeroSKillRequest );
        return SuccessResponse.ofNoData().asHttp( HttpStatus.OK );
    }
}
