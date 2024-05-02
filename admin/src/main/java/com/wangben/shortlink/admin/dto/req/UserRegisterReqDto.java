package com.wangben.shortlink.admin.dto.req;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.wangben.shortlink.admin.commen.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

/**
 * 用户注册请求参数
 */
@Data
public class UserRegisterReqDto {

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
}
