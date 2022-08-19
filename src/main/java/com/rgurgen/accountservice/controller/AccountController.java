package com.rgurgen.accountservice.controller;

import com.rgurgen.accountservice.entity.Account;
import com.rgurgen.accountservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        return ResponseEntity.ok(accountService.save(account));
    }

    @GetMapping
    public ResponseEntity<List<Account>> findAll(){
        return ResponseEntity.ok(accountService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> update(@RequestBody Account account,@PathVariable String id){
        return ResponseEntity.ok(accountService.update(id,account));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        accountService.delete(id);
    }
}
