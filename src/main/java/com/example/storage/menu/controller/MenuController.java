package com.example.storage.menu.controller;

import com.example.storage.menu.entityBean.Hmenu;
import com.example.storage.menu.service.MenuService;
import com.example.storage.utils.BaseController;
import com.example.storage.utils.Json;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/menuController")
@Log4j2
public class MenuController extends BaseController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/getMenuAll")
    public void getMenuAll(HttpServletResponse HttpServletResponse, HttpServletRequest HttpServletRequest){
        List<Hmenu> list  =  menuService.getMenuAll();
        Json j = new Json();
        if(list!=null&&list.size()>0){
            j.setMsg("成功");
            j.setObject(list);
            j.setSuccess(true);
        }else{
            j.setMsg("失败");
            j.setSuccess(false);
        }
        super.writeJson(j,HttpServletResponse);
    }
}
