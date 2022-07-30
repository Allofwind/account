package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //登录
    @Select("select * from user where username = #{user.username}")
    User login(@Param("user") User user);

    //注册
    @Insert("insert into user(username,password) values(#{user2.username},#{user2.password}) ")
    void addUser(@Param("user2")User user);
}
