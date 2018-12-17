package com.lmw.service.user.api.service;

import com.lmw.service.user.api.entity.User;
import com.lmw.service.user.api.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
   private UserMapper userMapper;

    public User select(int id){
        return  userMapper.select(id);
    }

   public List findAll(){
        return userMapper.findAll();
   }

   public Boolean deleteByName(String name){
        return userMapper.deleteByName(name);
   }
}
