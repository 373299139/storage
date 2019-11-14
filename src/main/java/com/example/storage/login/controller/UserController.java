package com.example.storage.login.controller;

import com.example.storage.login.entityBean.User;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/userController")
@Log4j2
public class UserController {

    @RequestMapping("/user_login")
    public String user_login(User users,Model model, HttpServletRequest HttpServletRequest, HttpServletResponse HttpServletResponse){
        log.info("登录人账号"+users.getUserName());
        log.info("进入方法");
        if(users!=null){
//            SM4Utils sm = new SM4Utils();
//            String s = sm.decryptData_CBC(users.getUserName());
        }
        User user = new User();
        user.setId(1);
        user.setUserName("123");
        user.setUserPsw("123");
        user.setUserPhone(123);
        user.setPopedom(0);
        HttpSession session =  HttpServletRequest.getSession();
        session.setAttribute("user",user);
        log.info("创建一个对象");
        List list = new ArrayList();
        list.add(user);
        model.addAttribute("users",list);
        log.info("出去方法");
    return "home/home";
    }
}
