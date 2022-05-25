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
public class University extends OrganizationComponent {

    /**
     * 学院
     */
    List<OrganizationComponent> colleges = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent college) {
        System.out.println("添加学院.........");
        colleges.add(college);
    }

    @Override
    protected void remove(OrganizationComponent college) {
        System.out.println("移除学院.........");
        colleges.remove(college);
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
        colleges.forEach(OrganizationComponent::print);

    }

}
