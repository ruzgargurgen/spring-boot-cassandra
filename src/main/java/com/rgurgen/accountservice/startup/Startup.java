package com.rgurgen.accountservice.startup;

import com.rgurgen.accountservice.entity.Account;
import com.rgurgen.accountservice.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Startup implements CommandLineRunner {

    private final AccountRepository accountRepository;

    public Startup(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Account> accounts=new ArrayList<>();

        for (int i=1; i<1000; i++){
            Account account=new Account();
            account.setName("test"+i);
            account.setSurname("test"+i);
            account.setUsername("test"+i);
            account.setCreatedAt(new Date());
            account.setBirthDate(new Date());
            account.setEmail("test"+i+"@gmial.com");
            account.setPassword("123456");
            account.setActive(true);
            accounts.add(account);
        }
        accountRepository.saveAll(accounts);
    }
}
