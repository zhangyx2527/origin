package com.origin.service.auth.controller;

import com.origin.common.core.domain.R;
import com.origin.model.domain.UserInfo;
import com.origin.service.auth.service.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyuxuan
 * @create 2022-11-19 13:34
 */
@RestController
@Api("用户接口")
@RequestMapping("/auth/userInfo")
public class UserInfoCotroller {

    @Autowired
    private UserInfoService userInfoService;

    @ApiOperation(value = "获取用户信息")
    @GetMapping("/getById/{id}")
    public R getById(@PathVariable Long id){
        UserInfo userInfo = userInfoService.getById(id);
        return R.ok(userInfo);
    }
}
