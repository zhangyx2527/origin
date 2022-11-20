package com.origin.service.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.origin.common.core.util.PageUtils;
import com.origin.model.domain.UserInfo;

import java.util.Map;

/**
 * 用户表
 *
 * @author zhangyuxuan
 * @email 252703218@qq.com
 * @date 2022-11-18 17:21:10
 */
public interface UserInfoService extends IService<UserInfo> {

    PageUtils queryPage(Map<String, Object> params);
}

