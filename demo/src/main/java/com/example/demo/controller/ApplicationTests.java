package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ApplicationTests {
    // 注入数据源对象
    @Autowired
    private DataSource dataSource;
    public static void main(String[] args) {
        SpringApplication.run(ApplicationTests.class, args);
    }

}