package com.wangben.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangben.shortlink.project.dao.entity.LinkDO;
import com.wangben.shortlink.project.dto.req.AddLinkReqDTO;
import com.wangben.shortlink.project.dto.resp.AddLinkRespDTO;

/**
 * 短链接接口层
 */
public interface LinkService extends IService<LinkDO> {

    /**
     * 创建短链接
     * @param requestParam
     * @return
     */
    AddLinkRespDTO createShortLink(AddLinkReqDTO requestParam);
}
