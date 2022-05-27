package com.yaron.iterator.college;

import com.yaron.iterator.Department;

import java.util.Iterator;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public interface College {

    public String getName();

    void addDepartment(String name,String desc);

    Iterator<Department> createIterator();
}
