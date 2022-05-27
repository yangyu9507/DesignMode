package com.yaron.command.weaver.service;

import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface SearchBaseService {

    /**
     * PC微搜搜索
     * @param params
     * @return
     */
    Map<String, Object> doSearch4pc(Map<String, Object> params);
}
