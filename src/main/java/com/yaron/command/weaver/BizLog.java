package com.yaron.command.weaver;

import com.yaron.command.weaver.entity.BizLogContext;

import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface BizLog {

    /**
     * 生成logContext对象
     * @return BizLogContext对象
     */
     BizLogContext getLogContext();

    /**
     * 生成logContext对象列表`
     * @return BizLogContext对象列表
     */
     List<BizLogContext> getLogContexts();
}
