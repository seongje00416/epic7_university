package com.example.epic7_university.equipment.artifact.service;

import com.example.epic7_university.common.dto.PageResponse;
import com.example.epic7_university.common.utils.PageUtils;
import com.example.epic7_university.equipment.artifact.dto.response.GetAllArtifactResponse;
import com.example.epic7_university.equipment.artifact.entity.Artifact;
import com.example.epic7_university.equipment.artifact.repository.ArtifactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArtifactService {
    private final ArtifactRepository artifactRepository;

    public PageResponse<GetAllArtifactResponse> getAllArtifact(PageRequest pageRequest) {
        return PageUtils.toPageResponse( artifactRepository.findAll( pageRequest ).map(
                GetAllArtifactResponse::of
        ));
    }
}
