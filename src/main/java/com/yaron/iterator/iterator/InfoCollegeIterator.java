package com.yaron.iterator.iterator;

import com.yaron.iterator.Department;

import java.util.Iterator;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class InfoCollegeIterator implements Iterator<Department> {

    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }
}
