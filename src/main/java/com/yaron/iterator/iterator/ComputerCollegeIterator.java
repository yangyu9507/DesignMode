package com.yaron.iterator.iterator;

import com.yaron.iterator.Department;

import java.util.Iterator;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class ComputerCollegeIterator implements Iterator<Department> {


    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Department next() {
        return departments[position++];
    }

    @Override
    public void remove() {

    }
}
