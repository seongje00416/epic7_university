package com.example.epic7_university.character.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldNameConstants
public class Imprint {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Enumerated( EnumType.STRING )
    private ImprintType imprintType;
    @Enumerated( EnumType.STRING )
    private Stats stats;
    private int startValue;
    private int uprate;
    private String startGrade;
}
