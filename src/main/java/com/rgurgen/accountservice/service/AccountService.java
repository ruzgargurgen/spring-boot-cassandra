package com.rgurgen.accountservice.service;


import com.rgurgen.accountservice.entity.Account;

import java.util.List;

public interface AccountService {
    Account save(Account account);

    List<Account> findAll();

    Account update(String id, Account account);

    void delete(String id);
}
