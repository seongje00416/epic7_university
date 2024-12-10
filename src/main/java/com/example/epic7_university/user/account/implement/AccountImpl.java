package com.example.epic7_university.user.account.implement;

import com.example.epic7_university.common.dto.SuccessResponse;
import com.example.epic7_university.user.account.controller.AccountController;
import com.example.epic7_university.user.account.dto.SignUpRequest;
import com.example.epic7_university.user.account.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/api/v1/account" )
@RequiredArgsConstructor
public class AccountImpl implements AccountController {
    private final AccountService accountService;
    @Override
    public ResponseEntity<SuccessResponse<Long>> login(String email, String password) {
        return SuccessResponse.of( accountService.login( email, password ) ).asHttp(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<SuccessResponse<Void>> signUp(SignUpRequest signUpRequest) {
        accountService.signUp( signUpRequest );
        return SuccessResponse.ofNoData().asHttp( HttpStatus.OK );
    }
}
