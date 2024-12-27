package com.example.epic7_university.equipment.exclusive.implement;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.equipment.exclusive.controller.ExclusiveController;
import com.example.epic7_university.equipment.exclusive.dto.response.GetAllHeroExclusiveResponse;
import com.example.epic7_university.equipment.exclusive.service.ExclusiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/api/v1/exclusive")
public class ExclusiveImplement implements ExclusiveController {
    private final ExclusiveService exclusiveService;

    @Override
    public ResponseEntity<SuccessResponse<PageResponse<GetAllHeroExclusiveResponse>>> getAllHeroExclusiveList(Long heroId) {
        PageRequest pageRequest = PageRequest.of(0, 3);
        return SuccessResponse.of( exclusiveService.getAllHeroExclusiveEquipment( heroId, pageRequest ) ).asHttp( HttpStatus.OK );
    }
}
