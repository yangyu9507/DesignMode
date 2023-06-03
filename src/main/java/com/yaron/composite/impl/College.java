package com.yaron.composite.impl;

import com.google.common.collect.Lists;
import com.yaron.composite.OrganizationComponent;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 学院
 */
@Slf4j
public class College extends OrganizationComponent {

    /**
     * 专业列表
     */
    List<OrganizationComponent> departments;

    public College(String name, String desc) {
        super(name, desc);
        this.departments = Lists.newArrayList();
    }

    @Override
    protected void add(OrganizationComponent department) {
        log.info("添加院系.........{}", department.getName());
        departments.add(department);
    }

    @Override
    protected void remove(OrganizationComponent department) {
        log.info("移除院系.........{}", department.getName());
        departments.remove(department);
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
        log.info("================== "+getName()+" ==========================");
        departments.forEach(OrganizationComponent::print);
    }
}
