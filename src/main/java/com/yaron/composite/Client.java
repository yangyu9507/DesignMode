package com.yaron.composite;

import com.yaron.composite.impl.College;
import com.yaron.composite.impl.Department;
import com.yaron.composite.impl.University;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {

        OrganizationComponent university = new University("HFUT", "好大学");

        OrganizationComponent college1 = new College("学院1", "学院1描述");
        OrganizationComponent college2 = new College("学院2", "学院2描述");


        OrganizationComponent department1 = new Department("学院1-专业1", "学院1-专业1描述");
        OrganizationComponent department2 = new Department("学院1-专业2", "学院1-专业2描述");
        OrganizationComponent department3 = new Department("学院1-专业3", "学院1-专业3描述");

        OrganizationComponent department4 = new Department("学院2-专业1", "学院2-专业1描述");
        OrganizationComponent department5 = new Department("学院2-专业2", "学院2-专业2描述");
        OrganizationComponent department6 = new Department("学院2-专业3", "学院2-专业3描述");

        university.add(college1);
        university.add(college2);

        college1.add(department1);
        college1.add(department2);
        college1.add(department3);

        college2.add(department4);
        college2.add(department5);
        college2.add(department6);

        university.print();

    }
}
