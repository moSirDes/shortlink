package com.wangben.shortlink.admin.controller;

import com.wangben.shortlink.admin.commen.convention.result.Result;
import com.wangben.shortlink.admin.commen.convention.result.Results;
import com.wangben.shortlink.admin.dto.req.AddGroupReqDTO;
import com.wangben.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;


    @PostMapping("/api/shortlink/v1/group")
    public Result<Void> save(@RequestBody AddGroupReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }
}
