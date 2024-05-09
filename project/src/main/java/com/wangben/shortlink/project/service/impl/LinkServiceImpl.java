package com.wangben.shortlink.project.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wangben.shortlink.project.dao.entity.LinkDO;
import com.wangben.shortlink.project.dao.mapper.LinkMapper;
import com.wangben.shortlink.project.dto.req.AddLinkReqDTO;
import com.wangben.shortlink.project.dto.resp.AddLinkRespDTO;
import com.wangben.shortlink.project.service.LinkService;
import com.wangben.shortlink.project.tooltik.HashUtil;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LinkServiceImpl extends ServiceImpl<LinkMapper, LinkDO> implements LinkService {
    @Override
    public AddLinkRespDTO createShortLink(AddLinkReqDTO requestParam) {
        String shortLink = generateSuffix(requestParam);
        LinkDO linkDO = BeanUtil.toBean(requestParam, LinkDO.class);

        return null;
    }

    private String generateSuffix(AddLinkReqDTO requestParam) {
        String originUrl = requestParam.getOriginUrl();
        return HashUtil.hashToBase62(originUrl);
    }
}
