package com.example.storage.menu.dao;

import com.example.storage.menu.entityBean.Hmenu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HmenuMapper {
    int deleteByPrimaryKey(Integer hId);

    int insert(Hmenu record);

    int insertSelective(Hmenu record);

    Hmenu selectByPrimaryKey(Integer hId);

    int updateByPrimaryKeySelective(Hmenu record);

    int updateByPrimaryKey(Hmenu record);

    List<Hmenu> getMenuAll(@Param("dele") int dele);
}