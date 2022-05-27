package com.yaron.iterator;

import com.yaron.iterator.college.College;
import com.yaron.iterator.college.impl.ComputerCollege;
import com.yaron.iterator.college.impl.InfoCollege;

import java.util.List;
import java.util.ArrayList;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);


        new OutputImpl(collegeList).printCollege();
    }
}
