package com.example.epic7_university.common.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners( AuditingEntityListener.class )
@Getter
@Setter
public abstract class BaseEntity {
}
