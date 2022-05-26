package com.yaron.flyweight;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description 外部状态
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
