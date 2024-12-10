package com.example.epic7_university.user.account.repository;

import com.example.epic7_university.user.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findAccountByEmailAndPassword( String email, String password );
}
