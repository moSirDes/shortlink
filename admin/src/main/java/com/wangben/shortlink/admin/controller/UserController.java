package com.wangben.shortlink.admin.controller;

import com.wangben.shortlink.admin.commen.convention.result.Result;
import com.wangben.shortlink.admin.commen.convention.result.Results;
import com.wangben.shortlink.admin.dto.req.UserLoginReqDTO;
import com.wangben.shortlink.admin.dto.req.UserRegisterReqDto;
import com.wangben.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.wangben.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.wangben.shortlink.admin.dto.resp.UserRespDto;
import com.wangben.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 检查用户名是否重复
     */
    @GetMapping("/api/shortlink/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUsername(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/api/shortlink/v1/user/register")
    public Result<Void> register(@RequestBody UserRegisterReqDto requestParam) {
        userService.registerUser(requestParam);
        return Results.success();
    }

    /**
     * 注用户信息修改
     */
    @PostMapping("/api/shortlink/v1/user/update")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        return Results.success();
    }

    /**
     * 用户登录
     */
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        UserLoginRespDTO result = userService.login(requestParam);
        return Results.success(result);
    }
}
