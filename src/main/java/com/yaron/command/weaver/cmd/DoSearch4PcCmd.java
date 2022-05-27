package com.yaron.command.weaver.cmd;

import com.yaron.command.weaver.AbstractCommonCommand;
import com.yaron.command.weaver.entity.BizLogContext;
import com.yaron.command.weaver.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class DoSearch4PcCmd extends AbstractCommonCommand<Map<String,Object>> {

    public DoSearch4PcCmd(User user, Map<String, Object> params) {
        this.user = user;
        this.params = params;
    }

    @Override
    public List<BizLogContext> getLogContexts() {
        return null;
    }


    @Override
    public Map<String, Object> execute() {
        //TODO  命令模式待处理
        return null;
    }


}
