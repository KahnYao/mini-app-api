package com.dpt.service.impl;

import com.alibaba.fastjson.JSON;
import com.dpt.common.ApiResult;
import com.dpt.model.User;
import com.dpt.service.LoginService;
import com.dpt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserService userService;

    public String Login(String openId) throws Exception {
        User user = this.userService.getUserByOpenId(openId);
        if(user == null) {
            //TODO:
        }
        return JSON.toJSONString(new ApiResult(0, "登录成功。", user));
    }


}
