package com.example.storage.login.service.impl;

import com.example.storage.login.dao.UserMapper;
import com.example.storage.login.entityBean.User;
import com.example.storage.login.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private  UserMapper userMapper;


    @Override
    public User seleUser(User users) {
        log.info(users.getUsername().toString(),users.getUserpsw().toString());
        User user = userMapper.seleUser(users.getUsername().toString(),users.getUserpsw().toString());
        if(user!=null){
            log.info(user.getUsername());
        }
        return user;
    }
}

