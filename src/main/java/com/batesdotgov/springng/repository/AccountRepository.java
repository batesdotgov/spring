package com.batesdotgov.springng.repository;

import com.batesdotgov.springng.domains.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByUserId(long id);
    Account findByPassword(String password);
}