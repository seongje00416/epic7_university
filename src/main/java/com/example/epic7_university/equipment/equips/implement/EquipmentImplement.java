package com.example.epic7_university.equipment.equips.implement;

import com.example.epic7_university.equipment.equips.controller.EquipmentController;
import com.example.epic7_university.equipment.equips.service.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping( "/api/v1/equipment")
public class EquipmentImplement implements EquipmentController {
    private final EquipmentService equipmentService;
}
