package com.example.storage.login.controller;

import com.example.storage.login.entityBean.User;
import com.example.storage.login.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rest/userController")
@Log4j2
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/user_login")
    @ResponseBody
    public Boolean user_login(@RequestBody User users, HttpServletRequest HttpServletRequest, HttpServletResponse HttpServletResponse) {
        System.out.println("sdsd");
        if (users != null) {
            if (!users.getUsername().equals("") && !users.getUserpsw().equals("")) {
                User uuser = userService.seleUser(users);
                if (uuser != null) {
                    HttpSession session = HttpServletRequest.getSession();
                    session.setAttribute("user", uuser);
                    List li = new ArrayList();
                    li.add(uuser);
                    return true;
                } else {
                    return false;
                }
            } else {
                String msg = "请正确输入账号密码";
                return false;
            }
        }
        return false;
    }
    @RequestMapping("/a")
    public String a(){
        return "index";
    }
    @RequestMapping("/b")
    public String b(){
        return "home/adminHome";
    }
}
