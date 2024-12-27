package com.example.epic7_university.equipment.artifact.entity;

import com.example.epic7_university.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@NoArgsConstructor( access = AccessLevel.PROTECTED )
@FieldNameConstants
public class Artifact extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    @Enumerated( EnumType.STRING )
    private UseClass useClass;
    private int attack;
    private int health;
    private int birthGrade;

    @Builder
    public Artifact (
            Long id,
            String name,
            UseClass useClass,
            int attack,
            int health,
            int birthGrade
    ) {
        this.id = id;
        this.name = name;
        this.useClass = useClass;
        this.attack = attack;
        this.health = health;
        this.birthGrade = birthGrade;
    }
}
