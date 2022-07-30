package com.example.demo.service.impl;

import com.example.demo.mapper.AccountMapper;
import com.example.demo.pojo.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public void add(Account account) {
        accountMapper.add(account);
    }

    @Override
    public void reduce(Account account) {
        accountMapper.reduce(account);
    }

    @Override
    public List<Account> select() {
        return accountMapper.select();
    }
}
