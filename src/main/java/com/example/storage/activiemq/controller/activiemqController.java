package com.example.storage.activiemq.controller;

import com.example.storage.activiemq.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/rest/activiemqController")
public class activiemqController {
    @Autowired
    private Producer producer;

    @RequestMapping("/getMq")
    public String mq(){
        String msg = "用户1";
        System.out.println(msg+"开始发出一次请求，时间是"+new Date());
        producer.sendMessage(msg);
        System.out.println(msg+"请求发送完成，时间是"+new Date());

        return "123";

    }
    @RequestMapping("/getMq2")
    public String mq2(){
        String msg = "用户2";
        System.out.println(msg+"开始发出一次请求，时间是"+new Date());
        producer.sendMessage(msg);
        System.out.println(msg+"请求发送完成，时间是"+new Date());

        return "123";

    }
}
