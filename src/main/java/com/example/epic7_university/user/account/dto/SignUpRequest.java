package com.example.epic7_university.user.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema( name = "Sign Up Request", description = "회원가입을 위한 요청" )
public record SignUpRequest(
        @Schema( description = "이메일" ) String email,
        @Schema( description = "비밀번호" ) String password,
        @Schema( description = "계정 레벨" ) int level,
        @Schema( description = "닉네임" ) String nickname,
        @Schema( description = "자기소개" ) String description
) {
}
