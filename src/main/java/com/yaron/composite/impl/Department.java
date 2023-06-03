package com.yaron.composite.impl;

import com.yaron.composite.OrganizationComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 专业
 */
@Slf4j
public class Department extends OrganizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public void print() {
        log.info("================== " + getName() + " ==========================");
    }
}
