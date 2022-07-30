package com.example.demo.mapper;

import com.example.demo.pojo.Account;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AccountMapper {
//收入账单
@Insert("insert into user_account(addMoney) values(#{a1.addMoney}) ")
    void add(@Param("a1") Account a1);

@Delete("delete * from user_account where id=#{user_account.id}")
    void reduce(Account account);

@Select("select * from user_account")
    List<Account> select();

}
