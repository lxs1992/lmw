package com.lmw.service.user.api.controller;

import com.lmw.service.user.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testUser")
public class UserController extends BaserController{
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id){
        return userService.select(id).toString();
    }

    @RequestMapping("findAll")
    public List findAllUser(){
        return userService.findAll();
    }

    @RequestMapping("deleteId")
    public Boolean deleteId(String name){
        if(name!=null && !"".equals(name)){
            return userService.deleteByName(name);
        }else {
            return false;
        }
    }
}
