package com.wangben.shortlink.project.dto.resp;

import lombok.Data;

@Data
public class AddLinkRespDTO {


    /**
     * 分组信息
     */
    private String gid;

    /**
     * 原始链接
     */
    private String originUrl;

    /**
     * 短链接
     */
    private String fullShortLink;
}
