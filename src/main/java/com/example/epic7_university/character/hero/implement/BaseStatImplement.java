package com.example.epic7_university.character.hero.implement;

import com.example.epic7_university.character.hero.controller.BaseStatController;
import com.example.epic7_university.character.hero.dto.request.GetBaseStatRequest;
import com.example.epic7_university.character.hero.dto.response.GetBaseStatResponse;
import com.example.epic7_university.character.hero.service.BaseStatService;
import com.example.epic7_university.common.dto.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( value = "/api/v1/baseStat" )
public class BaseStatImplement implements BaseStatController {
    private final BaseStatService baseStatService;
    @Override
    public ResponseEntity<SuccessResponse<GetBaseStatResponse>> getBaseStat(GetBaseStatRequest getBaseStatRequest) {
        GetBaseStatResponse getBaseStatResponse = baseStatService.getBaseStat( getBaseStatRequest );
        return SuccessResponse.of( getBaseStatResponse ).asHttp(HttpStatus.OK);
    }
}
