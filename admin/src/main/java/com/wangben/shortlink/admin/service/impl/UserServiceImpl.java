package com.wangben.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangben.shortlink.admin.commen.convention.exception.ClientException;
import com.wangben.shortlink.admin.commen.enums.UserErrorCodeEnum;
import com.wangben.shortlink.admin.dao.entity.UserDO;
import com.wangben.shortlink.admin.dao.mapper.UserMapper;
import com.wangben.shortlink.admin.dto.resp.UserRespDto;
import com.wangben.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 用户接口实现曾
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {
    @Override
    public UserRespDto getUserByUsername(String username) {

        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO :: getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        if (userDO == null) {
            throw new ClientException(UserErrorCodeEnum.USER_NULL);
        }
        UserRespDto result = new UserRespDto();
        BeanUtils.copyProperties(userDO,result);
        return result;
    }
}
