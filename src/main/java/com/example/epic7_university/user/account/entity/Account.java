package com.example.epic7_university.user.account.entity;

import com.example.epic7_university.common.entity.UserBaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Account extends UserBaseEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    // 로그인 이메일
    private String email;
    // 로그인 비밀번호
    private String password;

    @Builder
    public Account(
            String email,
            String password
    ){
        this.password = password;
        this.email = email;
    }
}
