package com.dpt.service;

import com.dpt.model.User;

public interface UserService {

    public User getUserByOpenId(String openId) throws Exception;

}
