package com.wangben.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangben.shortlink.admin.dao.entity.UserDO;
import com.wangben.shortlink.admin.dto.req.UserRegisterReqDto;
import com.wangben.shortlink.admin.dto.resp.UserRespDto;

public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询信息
     * @param username
     * @return
     */
    UserRespDto getUserByUsername(String username);

    /**
     * 检查用户名是否会存在
     * @param username
     * @return
     */
    Boolean hasUsername(String username);

    /**
     * 用户注册
     * @param requestParam
     */
    void registerUser(UserRegisterReqDto requestParam);
}
