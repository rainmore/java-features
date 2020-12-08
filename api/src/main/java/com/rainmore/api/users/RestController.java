package com.rainmore.api.users;

import com.rainmore.domains.Account;
import com.rainmore.modules.users.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping({"/", "/api/users"})
public class RestController {

    private AccountService accountService;

    @Autowired
    public RestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping()
    public List<Account> list() {
        return accountService.findAll();
    }
}
