package com.wangben.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wangben.shortlink.admin.commen.database.BaseDO;
import com.wangben.shortlink.admin.commen.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

import java.io.Serializable;

/**
 *用户信息持久层
 */
@TableName("t_user")
@Data
public class UserDO extends BaseDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    @JsonSerialize(using = PhoneDesensitizationSerializer.class)
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 注销时间戳
     */
    private Long deletionTime;


}
