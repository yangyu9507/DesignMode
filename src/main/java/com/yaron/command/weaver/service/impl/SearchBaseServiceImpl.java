package com.yaron.command.weaver.service.impl;

import com.yaron.command.weaver.cmd.DoSearch4PcCmd;
import com.yaron.command.weaver.service.SearchBaseService;
import com.yaron.command.weaver.service.Service;

import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class SearchBaseServiceImpl extends Service implements SearchBaseService {


    @Override
    public Map<String, Object> doSearch4pc(Map<String, Object> params) {
        return commandExecutor.execute(new DoSearch4PcCmd(user, params));
    }
}
