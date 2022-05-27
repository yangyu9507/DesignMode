package com.yaron.iterator.college.impl;

import com.yaron.iterator.Department;
import com.yaron.iterator.college.College;
import com.yaron.iterator.iterator.ComputerCollegeIterator;

import java.util.Iterator;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java专业", "java描述");
        addDepartment("php专业", "php描述");
        addDepartment("ES专业", "ES描述");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[numOfDepartment++] = new Department(name, desc);
    }

    /**
     * 返回迭代器
     *
     * @return
     */
    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
