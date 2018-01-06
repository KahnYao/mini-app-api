package com.dpt.web;

import com.alibaba.fastjson.JSON;
import com.dpt.common.ApiResult;
import com.dpt.common.ResultConstant;
import com.dpt.model.Technician;
import com.dpt.service.TechnicianService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("TechnicianController 接口")
@RestController
@RequestMapping("/technician")
public class TechnicianController {
    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private TechnicianService technicianService;

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
        return JSON.toJSONString(new ApiResult(ResultConstant.SUCCESS, this.technicianService.insertTechnician(technician)));
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
            Technician technician = technicianService.getTechnicianById(id);
            return JSON.toJSONString(new ApiResult(ResultConstant.SUCCESS, technician));
        } catch (Exception e) {
            logger.error("----------------------------------ERROR");
            return JSON.toJSONString(new ApiResult(ResultConstant.ERROR, new Object()));
        }
    }
}
