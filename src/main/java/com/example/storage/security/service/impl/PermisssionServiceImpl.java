package com.example.storage.security.service.impl;

import com.example.storage.security.dao.PermisssionMapper;
import com.example.storage.security.entityBean.Permisssion;
import com.example.storage.security.service.PermisssionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PermisssionServiceImpl implements PermisssionService {
    @Resource
    private PermisssionMapper permisssionMapper;
    @Override
    public  List<Permisssion> getModel(){
       List<Permisssion> model = permisssionMapper.getModel();

        return model;
    }

    @Override
    public int insertModel(Permisssion permisssion) {
        int i = permisssionMapper.insertModel(permisssion);
        return i;
    }
    @Override
    public Long deleteModelByPk(Long id){
        Long model = permisssionMapper.deleteModelByPk(id);

        return model;
    }
    @Override
    public  int updateModel(Permisssion permisssion){
        int i = permisssionMapper.updateModel(permisssion);

        return i;
    }
    @Override
    public List<Permisssion> getModelByPk(Long id){
        Permisssion permisssion =new Permisssion();
        permisssion.setId(1);
        Map map =new HashMap();
        map.put("magicalCoderPrimaryKeyName",id);
        List<Permisssion> modelByPk = permisssionMapper.getModelByPk(map);
        return modelByPk;
    }
}
