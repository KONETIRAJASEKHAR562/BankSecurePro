
package com.bankmanagement.service;

import com.bankmanagement.model.Account;
import com.bankmanagement.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    public void deleteAccountById(Long id) {
        accountRepository.deleteById(id);
    }
}
