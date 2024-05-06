package com.wangben.shortlink.admin.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "createTime", Date::new, Date.class); // 起始版本 3.3.0(推荐使用)
        strictInsertFill(metaObject, "updateTime", Date::new, Date.class); // 起始版本 3.3.0(推荐使用)
        strictInsertFill(metaObject, "delFlag", () -> 0, Integer.class); // 起始版本 3.3.0(推荐使用)

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        strictInsertFill(metaObject, "updateTime", Date::new, Date.class); // 起始版本 3.3.0(推荐使用)
    }
}
