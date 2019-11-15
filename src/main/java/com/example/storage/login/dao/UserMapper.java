package com.example.storage.login.dao;

import com.example.storage.login.entityBean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * @param username
     * @param userpsw
     * @return
     */
    User seleUser(@Param("username") String username, @Param("userpsw") String userpsw);
}