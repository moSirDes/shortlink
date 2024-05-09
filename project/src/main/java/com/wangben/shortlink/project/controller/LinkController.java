package com.wangben.shortlink.project.controller;

import com.wangben.shortlink.project.common.convention.result.Result;
import com.wangben.shortlink.project.common.convention.result.Results;
import com.wangben.shortlink.project.dto.req.AddLinkReqDTO;
import com.wangben.shortlink.project.dto.resp.AddLinkRespDTO;
import com.wangben.shortlink.project.service.LinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LinkController {

    private final LinkService linkService;

    @PostMapping("/api/shortlink/v1/addlink")
    public Result<AddLinkRespDTO> createLink(@RequestBody AddLinkReqDTO requestParma) {

        return Results.success(null);
    }
}
