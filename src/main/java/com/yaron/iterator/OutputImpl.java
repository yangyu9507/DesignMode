package com.yaron.iterator;

import com.yaron.iterator.college.College;

import java.util.Iterator;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class OutputImpl {

    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department next = iterator.next();
            System.out.println("Department.name = " + next.getName());
        }
    }
}
