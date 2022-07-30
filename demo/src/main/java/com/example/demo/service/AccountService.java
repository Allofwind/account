package com.example.demo.service;

import com.example.demo.pojo.Account;

import java.util.List;

public interface AccountService {
    void add(Account account);
    void reduce(Account account);
//查询整个
    List<Account> select();

}
