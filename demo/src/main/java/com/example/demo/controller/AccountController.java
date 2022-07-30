package com.example.demo.controller;

import com.example.demo.pojo.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@ResponseBody
@Controller
@CrossOrigin(origins = "*") // 解决前端的跨域问题
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/account_1")
    public void add(Account account, HttpServletRequest request) {
        System.out.println("记账"+account);
        accountService.add(account);
    }



    @RequestMapping("/account")
    public List<Account> select(Account account) {
        List<Account> data = accountService.select();
      return data;
    }

}
