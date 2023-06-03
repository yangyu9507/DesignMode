package com.yaron.composite.impl;

import com.google.common.collect.Lists;
import com.yaron.composite.OrganizationComponent;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 学校
 */
@Slf4j
public class University extends OrganizationComponent {

    /**
     * 学院列表
     */
    private List<OrganizationComponent> colleges;

    public University(String name, String desc) {
        super(name, desc);
        this.colleges = Lists.newArrayList();
    }

    @Override
    protected void add(OrganizationComponent college) {
        log.info("添加学院.........{}", college.getName());
        this.colleges.add(college);
    }

    @Override
    protected void remove(OrganizationComponent college) {
        log.info("移除学院.........{}", college.getName());
        this.colleges.remove(college);
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
        colleges.forEach(OrganizationComponent::print);
    }

}
