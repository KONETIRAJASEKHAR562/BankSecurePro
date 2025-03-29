package com.banksecurepro.service;

import com.banksecurepro.model.Account;
import com.banksecurepro.model.Transaction;

import java.math.BigDecimal;

public interface TransactionService {
    Transaction deposit(Account account, BigDecimal amount);
    Transaction withdraw(Account account, BigDecimal amount);
}
