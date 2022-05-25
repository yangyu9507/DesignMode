package com.yaron.composite.impl;

import com.yaron.composite.OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class College extends OrganizationComponent {

    /**
     * 院系
     */
    List<OrganizationComponent> departments = new ArrayList<>();


    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent department) {
        System.out.println("添加院系.........");
        departments.add(department);
    }

    @Override
    protected void remove(OrganizationComponent department) {
        System.out.println("移除院系.........");
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
        System.out.println("================== "+getName()+" ==========================");
        departments.forEach(OrganizationComponent::print);
    }
}
