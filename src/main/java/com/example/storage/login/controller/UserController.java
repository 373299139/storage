package com.example.storage.login.controller;

import com.example.storage.login.entityBean.User;
import com.example.storage.login.service.UserService;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/userController")
@Log4j2
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/user_login")
    public String user_login(User users,Model model, HttpServletRequest HttpServletRequest, HttpServletResponse HttpServletResponse){
        log.info("登录人账号"+users.getUsername());
//(
        if(!users.getUsername().equals("")&&!users.getUserpsw().equals("")){
           User uuser = userService.seleUser(users);
            if(uuser!=null){
                HttpSession session = HttpServletRequest.getSession();
                session.setAttribute("user",uuser);
                List li = new ArrayList();
                li.add(uuser);
                model.addAttribute("users",li);
                return "home/home";
            }else{
                return "index";
            }
        }else{
            String msg = "请正确输入账号密码";
            model.addAttribute("msg",msg);
            return "index";
        }
//        User user = new User();
//        user.setId(1);
//        user.setUsername("123");
//        user.setUserpsw("123");
//        user.setUserphone(123);
//        user.setPopedom(0);
//        HttpSession session =  HttpServletRequest.getSession();
//        session.setAttribute("user",user);
//        log.info("创建一个对象");
//        List list = new ArrayList();
//        list.add(user);
//        model.addAttribute("users",list);
//        log.info("出去方法");
    }
    @RequestMapping("/a")
    public String a(){
        return "index";
    }
}
