package com.origin.service.auth.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.origin.model.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author zhangyuxuan
 * @email 252703218@qq.com
 * @date 2022-11-18 17:21:10
 */
@Mapper
public interface UserInfoDao extends BaseMapper<UserInfo> {
	
}
