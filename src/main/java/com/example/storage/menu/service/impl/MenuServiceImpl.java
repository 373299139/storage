package com.example.storage.menu.service.impl;

import com.example.storage.menu.dao.HmenuMapper;
import com.example.storage.menu.entityBean.Hmenu;
import com.example.storage.menu.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private HmenuMapper mmenuMapper;

    @Override
    public List<Hmenu> getMenuAll() {
        List<Hmenu> list = mmenuMapper.getMenuAll(0);
        if(list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
