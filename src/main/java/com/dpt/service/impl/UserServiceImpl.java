package com.dpt.service.impl;

import com.dpt.mapper.UserMapper;
import com.dpt.model.User;
import com.dpt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    public User getUserByOpenId(String openId) throws Exception {
        return this.userMapper.getUserByOpenId(openId);
    }

}
