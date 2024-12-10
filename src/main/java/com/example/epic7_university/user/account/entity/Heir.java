package com.example.epic7_university.user.account.entity;

import com.example.epic7_university.common.entity.UserBaseEntity;
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
public class Heir extends UserBaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    // 게임 내에서 사용하는 UID
    @Column(unique = true)
    private String uid;
    // 계정 정보
    @OneToOne
    @JoinColumn( name = "account_id" )
    private Account account;
    // 유저 레벨
    private int level;
    // 게임 내 닉네임
    private String nickname;
    // 프로필 이미지
    private String profileImage;
    // 자기소개
    private String description;

    @Builder
    public Heir(
            int level,
            Account account,
            String nickname,
            String description
    ){
        this.level = level;
        this.account = account;
        this.nickname = nickname;
        this.description = description;
    }
}
