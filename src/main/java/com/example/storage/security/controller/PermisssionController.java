package com.example.storage.security.controller;

import com.example.storage.security.entityBean.Permisssion;
import com.example.storage.security.service.PermisssionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest/PermisssionController")
public class PermisssionController {

    @Autowired
    private PermisssionService permisssionService;
    /**
     *
     * @return 全部权限信息
     */
    @RequestMapping("/getModel")
    public List<Permisssion> getModel(){
        System.out.println("0");
        List<Permisssion> model = permisssionService.getModel();
        System.out.println("1");
        return model;
    }

    /**
     *
     * @param permisssions  权限信息实体
     * @return 执行成功数量 =1 为成功
     */
    @RequestMapping("/savePermisssion")
    public int savePermisssion(Permisssion permisssions){

        Permisssion  permisssion = new Permisssion();
        permisssion.setName("低级管理员");
        permisssion.setCode("systeam-d");
        int i = permisssionService.insertModel(permisssion);

        return i;
    }

    /**
     *
     * @param id 要删除的权限信息id Long
     * @return    执行成功数量 =1 为成功
     */
    @RequestMapping("/deleteModelByPk")
    public Long deleteModelByPk(Long  id){
        id = (long)3;
        Long i = permisssionService.deleteModelByPk(id);
        return i;
    }

    /**
     *
     * @param permisssion  要更新的实体
     * @return
     */

    @RequestMapping("/updateModel")
    public int updateModel(Permisssion permisssion){
        permisssion.setId(1);
        permisssion.setName("普通管理员");
        permisssion.setCode("systeam-p");
        int i = permisssionService.updateModel(permisssion);
        return i;
    }

    /**
     *
     * @param id 要查询的id
     * @return
     */
    @RequestMapping("/getModelByPk")
    public List<Permisssion> getModelByPk(Long id){
        id=(long) 1;
        List<Permisssion> modelByPk = permisssionService.getModelByPk(id);
        return modelByPk;

    }
}
