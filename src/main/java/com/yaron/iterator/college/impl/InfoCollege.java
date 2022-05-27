package com.yaron.iterator.college.impl;

import com.yaron.iterator.Department;
import com.yaron.iterator.college.College;
import com.yaron.iterator.iterator.InfoCollegeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class InfoCollege implements College {

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全", "信息安全");
        addDepartment("信息工程", "信息工程");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departmentList.add(new Department(name, desc));
    }

    @Override
    public Iterator<Department> createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
