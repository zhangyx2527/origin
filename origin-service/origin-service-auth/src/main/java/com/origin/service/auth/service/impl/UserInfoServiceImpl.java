package com.origin.service.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.origin.common.core.util.PageUtils;
import com.origin.common.core.util.Query;
import com.origin.model.domain.UserInfo;
import com.origin.service.auth.dao.UserInfoDao;
import com.origin.service.auth.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author zhangyuxuan
 */
@Service("userInfoService")
public class UserInfoServiceImpl extends ServiceImpl<UserInfoDao, UserInfo> implements UserInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserInfo> page = this.page(
                new Query<UserInfo>().getPage(params),
                new QueryWrapper<UserInfo>()
        );
        return new PageUtils(page);
    }

}