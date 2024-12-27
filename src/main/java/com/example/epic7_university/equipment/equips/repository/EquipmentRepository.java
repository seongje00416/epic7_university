package com.example.epic7_university.equipment.equips.repository;

import com.example.epic7_university.equipment.equips.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}
