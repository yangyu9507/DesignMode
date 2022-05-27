package com.yaron.command.weaver;

import com.yaron.command.weaver.entity.BizLogContext;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public abstract class AbstractCommonCommand<T> extends AbstractCommand<T> implements CommandLog, BizLog{


    @Override
    public boolean isAutoWriteLog() {
        return true;
    }

    @Override
    public void writeBizLog() {

    }

    @Override
    public BizLogContext getLogContext() {
        return null;
    }
}
