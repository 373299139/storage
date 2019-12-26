package com.example.storage.security.dao;


import com.example.storage.security.entityBean.Permisssion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface PermisssionMapper {

    List<Permisssion> getModel();

    int insertModel(Permisssion permisssion);

    Long deleteModelByPk(@Param("magicalCoderPrimaryKeyName")Long id);

    int updateModel(Permisssion permisssion);

    List<Permisssion>  getModelByPk(Map map);
}
