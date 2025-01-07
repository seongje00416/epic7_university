package com.example.epic7_university.v2.entity;

import com.example.epic7_university.common.entity.BaseEntity;
import com.example.epic7_university.v2.entity.type.HeroClass;
import com.example.epic7_university.v2.entity.type.HeroElement;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldNameConstants
public class Hero extends BaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private int grade;
    @Enumerated( EnumType.STRING )
    private HeroClass heroClass;
    @Enumerated( EnumType.STRING )
    private HeroElement element;
    private String portraitURL;
    private String profileURL;

    @Builder
    public Hero(
            Long id,
            String name,
            int grade,
            HeroClass heroClass,
            HeroElement element,
            String portraitURL,
            String profileURL
    ){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.heroClass = heroClass;
        this.element = element;
        this.portraitURL = portraitURL;
        this.profileURL = profileURL;
    }
}
