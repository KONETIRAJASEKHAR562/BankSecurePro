package com.banksecurepro.service;

import com.banksecurepro.model.Account;
import com.banksecurepro.model.User;

public interface AccountService {
    Account createAccount(User user);
    Account getAccountByUser(User user);
}
