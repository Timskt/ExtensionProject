package com.sky.toolkit.controller;

import com.sky.toolkit.model.vo.ResultVO;
import com.sky.toolkit.model.vo.UserInfoVO;
import com.sky.toolkit.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/***
 @author 蔡联发
 @date 2022/10/22
 @version 1.0
 */
@Api(tags = "用户信息")
@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @ApiOperation("更新用户信息")
    @PutMapping("/users/info")
    public ResultVO<?> updateUserInfo(@Valid @RequestBody UserInfoVO userInfoVO) {
        return ResultVO.ok();
    }

}
