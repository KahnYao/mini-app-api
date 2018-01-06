package com.dpt.web;

import com.alibaba.fastjson.JSON;
import com.dpt.common.ApiResult;
import com.dpt.common.ResultConstant;
import com.dpt.mapper.TechnicianMapper;
import com.dpt.model.Technician;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("ProductController 接口")
@RestController
@RequestMapping("/product")
public class ProductController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private TechnicianMapper technicianMapper;

    /**
     * 创建新用户
     *
     * @param technician
     * @return
     */
    @ApiOperation(value = "创建新技师", notes = "创建新技师")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "technician", value = "用户实体", required = true, dataType = "Technician")
    })
    @RequestMapping(value = "/insertTechnician", method = RequestMethod.PUT)
    public String insertUserInfo(@RequestBody Technician technician) throws Exception {
        return JSON.toJSONString(new ApiResult(ResultConstant.SUCCESS, this.technicianMapper.insert(technician)));
    }

    /**
     * 根据Id获取技师信息
     *
     * @param id
     * @return
     */
    @ApiOperation(value = "根据Id获取用户信息", notes = "根据Id获取用户信息")
    @RequestMapping(value = "/getTechnicianById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getTechnicianById(@PathVariable("id") Integer id) throws Exception {
        try {
            Technician technician = technicianMapper.getTechnicianById(id);
            if (technician == null) {
                return id + "不存在";
            } else {
                return JSON.toJSONString(new ApiResult(ResultConstant.SUCCESS, technician));
            }
        } catch (Exception e) {
            logger.error("----------------------------------ERROR");
            return JSON.toJSONString(new ApiResult(ResultConstant.ERROR, new Object()));
        }
    }
}
