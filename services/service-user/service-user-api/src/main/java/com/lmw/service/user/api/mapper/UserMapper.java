package com.lmw.service.user.api.mapper;

import com.lmw.service.user.api.entity.User;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User select(int id);
    List findAll();
    boolean deleteByName(String name);

}
