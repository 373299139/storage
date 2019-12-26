package com.example.storage.security.service;

import com.example.storage.security.entityBean.Permisssion;

import java.util.List;

public interface PermisssionService {
    List<Permisssion> getModel();

    int insertModel(Permisssion permisssion);

    Long deleteModelByPk(Long id);

    int updateModel(Permisssion permisssion);

    List<Permisssion> getModelByPk(Long id);
}
