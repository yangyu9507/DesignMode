package com.yaron.command.weaver;

import com.yaron.command.weaver.entity.User;

import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public abstract class AbstractCommand <T> implements Command<T>{

    /**
     * user对象
     */
    protected User user;

    /**
     * 参数列表
     */
    protected Map<String, Object> params;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

}
