package com.example.epic7_university.equipment.exclusive.repository;

import com.example.epic7_university.equipment.exclusive.controller.ExclusiveController;
import com.example.epic7_university.equipment.exclusive.entity.ExclusiveEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExclusiveRepository extends JpaRepository<ExclusiveEquipment, Long> {
}
