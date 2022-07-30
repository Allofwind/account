package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

//@RestController
@Controller
@ResponseBody
@CrossOrigin(origins = "*") // 解决前端的跨域问题
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public User login2(User user, HttpServletRequest request) {
        return userService.login(user);
    }
    @RequestMapping("/templates/login")
    public String login(User user, HttpServletRequest request) {
        try {
            System.out.println("user:"+user.getUsername());
            User u = userService.login(user);
            if (u != null) {
                request.getSession().setAttribute("USER_SESSION", u);
                return "redirect:/templates/main";
            }
            request.setAttribute("msg", "用户名或密码错误");
            return "forward:/templates/login";
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("msg", "系统错误");
            return "forward:/templates/login";
        }
    }

    //用户注册
    @RequestMapping("/templates/register")
    public String register(User user){
        userService.addUser(user);
        return "/static/register.html";
    }

    public static void main(String[] args){
//        http://192.168.1.54:8089/templates/register?username=aaaa&password=bbbb
        String un="aaaa";
        String pw="bbbb";
        String str4= "http://192.168.1.54:8089/templates/register?"+"username="+un+"&password="+pw;
        System.out.println(str4);
    }
}
