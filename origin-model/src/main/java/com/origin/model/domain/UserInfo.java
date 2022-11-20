package com.origin.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author zhangyuxuan
 * @email 252703218@qq.com
 * @date 2022-11-17 13:04:51
 */
@Data
@ApiModel(description = "UserInfo")
@TableName("auth_user_info")
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@ApiModelProperty(value = "用户ID")
	@TableId(type = IdType.AUTO)
	private Long id;
	/**
	 * 用户名
	 */
	@ApiModelProperty(value = "用户名")
	private String username;
	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String password;
	/**
	 * 用户昵称
	 */
	@ApiModelProperty(value = "用户昵称")
	private String nickname;
	/**
	 * 手机号
	 */
	@ApiModelProperty(value = "手机号")
	private String mobile;
	/**
	 * 邮箱
	 */
	@ApiModelProperty(value = "邮箱")
	private String email;
	/**
	 * 头像
	 */
	@ApiModelProperty(value = "头像")
	private String header;
	/**
	 * 性别
	 */
	@ApiModelProperty(value = "性别")
	private Integer gender;
	/**
	 * 生日
	 */
	@ApiModelProperty(value = "生日")
	private Date birth;
	/**
	 * 城市
	 */
	@ApiModelProperty(value = "城市")
	private String city;
	/**
	 * 职业
	 */
	@ApiModelProperty(value = "职业")
	private String job;
	/**
	 * 个性签名
	 */
	@ApiModelProperty(value = "个性签名")
	private String sign;
	/**
	 * 用户来源
	 */
	@ApiModelProperty(value = "用户来源")
	private Integer sourceType;
	/**
	 * 用户状态
	 */
	@ApiModelProperty(value = "用户状态")
	private Integer status;

	/**
	 * 注册时间
	 */
	@ApiModelProperty(value = "注册时间")
	private Date createTime;
	/**
	 * 更新时间
	 */
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;

	/**
	 * 删除标识
	 */
	@ApiModelProperty(value = "删除标识")
	@TableLogic
	@TableField("is_del")
	private Integer del;

}
