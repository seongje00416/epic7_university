package com.example.epic7_university.user.account.entity;

import com.example.epic7_university.common.entity.UserBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldNameConstants
public class Heir extends UserBaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    // 게임 내에서 사용하는 UID
    @GeneratedValue( strategy = GenerationType.UUID )
    private String uid;
    // 유저 레벨
    private int level;
    // 게임 내 닉네임
    private String nickname;
    // 프로필 이미지
    private String profileImage;
    // 자기소개
    private String description;
}
