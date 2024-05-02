package com.wangben.shortlink.admin.controller;

import com.wangben.shortlink.admin.commen.convention.result.Result;
import com.wangben.shortlink.admin.commen.convention.result.Results;
import com.wangben.shortlink.admin.dto.resp.UserRespDto;
import com.wangben.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制曾
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询用户
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDto> getUserByUsername(@PathVariable("username") String username) {

        UserRespDto result = userService.getUserByUsername(username);
        if (result == null) {
            return new Result<UserRespDto>().setCode("111").setMessage("asdasd");
        } else {
            return Results.success(result);
        }
    }
}
