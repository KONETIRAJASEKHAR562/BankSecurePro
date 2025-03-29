
package com.bankmanagement.controller;

import com.bankmanagement.model.Account;
import com.bankmanagement.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/admin")
public class AdminController {

    private final AccountService accountService;

    public AdminController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public String listAccounts(Model model) {
        List<Account> accounts = accountService.findAllAccounts();
        model.addAttribute("accounts", accounts);
        return "admin/accounts";
    }

    @PostMapping("/delete/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountService.deleteAccountById(id);
        return "redirect:/api/admin/accounts";
    }
}
