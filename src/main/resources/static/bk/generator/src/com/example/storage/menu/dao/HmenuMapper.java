package com.example.storage.menu.dao;

import com.example.storage.menu.entityBean.Hmenu;

public interface HmenuMapper {
    int deleteByPrimaryKey(Integer hId);

    int insert(Hmenu record);

    int insertSelective(Hmenu record);

    Hmenu selectByPrimaryKey(Integer hId);

    int updateByPrimaryKeySelective(Hmenu record);

    int updateByPrimaryKey(Hmenu record);
}