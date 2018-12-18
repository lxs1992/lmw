package com.lmw.service.user.api.controller;

import javax.servlet.http.HttpSession;

/*session里面获取uid*/
public abstract class BaserController {
    protected Integer getUidFromSession(HttpSession httpSession){
        return Integer.valueOf(httpSession.getAttribute("uid").toString());
    }
}
