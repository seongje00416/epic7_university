package com.example.epic7_university.equipment.exclusive.implement;

import com.example.epic7_university.equipment.exclusive.controller.ExclusiveController;
import com.example.epic7_university.equipment.exclusive.service.ExclusiveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/api/v1/exclusive")
public class ExclusiveImplement implements ExclusiveController {
    private final ExclusiveService exclusiveService;
}
