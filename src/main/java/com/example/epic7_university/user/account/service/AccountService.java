package com.example.epic7_university.user.account.service;

import com.example.epic7_university.user.account.dto.SignUpRequest;
import com.example.epic7_university.user.account.entity.Account;
import com.example.epic7_university.user.account.entity.Heir;
import com.example.epic7_university.user.account.exception.AccountNotFoundException;
import com.example.epic7_university.user.account.repository.AccountRepository;
import com.example.epic7_university.user.account.repository.HeirRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final HeirRepository heirRepository;

    public Long login( String email, String password ){
        Account account = accountRepository.findAccountByEmailAndPassword( email, password ).orElseThrow( AccountNotFoundException::new );
        return account.getId();
    }

    public void signUp(SignUpRequest signUpRequest ){
        Account account = Account.builder()
                .email(signUpRequest.email() )
                .password(signUpRequest.password() )
                .build();
        Account successAccount = accountRepository.save( account );
        Heir heir = Heir.builder()
                .level(signUpRequest.level() )
                .account( successAccount )
                .nickname(signUpRequest.nickname())
                .description(signUpRequest.description())
                .build();
        heirRepository.save( heir );
    }
}
