package com.example.epic7_university.equipment.exclusive.service;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.utils.PageUtils;
import com.example.epic7_university.equipment.exclusive.dto.response.GetAllHeroExclusiveResponse;
import com.example.epic7_university.equipment.exclusive.repository.ExclusiveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExclusiveService {
    private final ExclusiveRepository exclusiveRepository;

    public PageResponse<GetAllHeroExclusiveResponse> getAllHeroExclusiveEquipment( Long heroId, PageRequest pageRequest ) {
        return PageUtils.toPageResponse( exclusiveRepository.findAllByHeroId( heroId, pageRequest ).map(
                GetAllHeroExclusiveResponse::of
        ) );
    }
}
