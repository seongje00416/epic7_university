package com.example.epic7_university.equipment.equips.service;

import com.example.epic7_university.equipment.equips.repository.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;
}
