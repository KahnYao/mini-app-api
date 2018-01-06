package com.dpt.web;

import com.alibaba.fastjson.JSON;
import com.dpt.common.ApiResult;
import com.dpt.common.ResultConstant;
import com.dpt.model.User;
import com.dpt.mapper.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Api("UserController 接口")
@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserMapper userMapper;

    /**
     * 创建新用户
     *
     * @param user
     * @return
     */
    @ApiOperation(value = "创建新用户", notes = "创建新用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    })
    @RequestMapping(value = "/insertUserInfo", method = RequestMethod.PUT)
    public String insertUserInfo(@RequestBody User user) throws Exception {
        try {
            User u = new User();
            u.setNickName(user.getNickName());
            u.setOpenId(user.getOpenId());
            u.setGender(user.getGender());
            u.setLanguage(user.getLanguage());
            u.setCountry(user.getCountry());
            u.setProvince(user.getProvince());
            u.setCity(user.getCity());
            u.setAvatarUrl(user.getAvatarUrl());
            u.setUnionId(user.getUnionId());
            u.setSessionKey(user.getSessionKey());
            u.setCreatedTime(user.getCreatedTime());
            u.setUpdatedTime(user.getUpdatedTime());
            userMapper.insert(u);
            return "success";
        } catch (Exception e) {
            logger.error("----------------------------------ERROR");
            return "error";
        }
    }

    /**
     * 根据Name获取用户信息
     *
     * @param nickName
     * @return
     */
    @ApiOperation(value = "根据Name获取用户信息", notes = "根据Name获取用户信息")
    @RequestMapping(value = "/getUserByName/{nickName}", method = RequestMethod.GET)
    @ResponseBody
    public String getUserByName(@PathVariable("nickName") String nickName) throws Exception {
        try {
            User user = userMapper.getUserByName(nickName);
            if (user == null) {
                return nickName + "不存在";
            } else {
                return JSON.toJSONString(new ApiResult(ResultConstant.SUCCESS, user));
            }
        } catch (Exception e) {
            logger.error("----------------------------------ERROR");
            return JSON.toJSONString(new ApiResult(ResultConstant.ERROR, new Object()));
        }
    }

    /**
     * 根据Id获取用户信息
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "根据Id获取用户信息", notes = "根据Id获取用户信息")
    @RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getUserById(@PathVariable("id") Integer id) throws Exception {
        try {
            User user = userMapper.getUserById(id);
            if (user == null) {
                return id + "不存在";
            } else {
                return JSON.toJSONString(new ApiResult(ResultConstant.SUCCESS, user));
            }
        } catch (Exception e) {
            logger.error("----------------------------------ERROR");
            return JSON.toJSONString(new ApiResult(ResultConstant.ERROR, new Object()));
        }
    }

    /**
     * 获取用户列表
     *
     * @return
     */
    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    @ResponseBody
    public String getUsers() throws Exception {
        try {
            List<User> user1 = userMapper.getUsers();
            if (user1 == null) {
                return "不存在";
            } else {
                return "success";
            }
        } catch (Exception e) {
            logger.error("----------------------------------ERROR");
            return "success";
        }
    }

    /**
     * 更新用户信息
     *
     * @param id
     * @param user
     * @return
     */
    @ApiOperation(value = "更新用户信息", notes = "更新用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "user1", value = "用户实体", required = true, dataType = "User1")
    })
    @RequestMapping(value = "/updateUserInfo/{id}", method = RequestMethod.PUT)
    public String updateUserInfo(@PathVariable("id") Integer id, @RequestBody User user) throws Exception {
        try {
            User u = userMapper.getUserById(id);
            u.setNickName(user.getNickName());
            u.setOpenId(user.getOpenId());
            userMapper.update(u);
            return "success";
        } catch (Exception e) {
            logger.error("----------------------------------ERROR");
            return "success";
        }
    }


}
