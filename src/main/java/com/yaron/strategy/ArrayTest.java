package com.yaron.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class ArrayTest {

    public static void main(String[] args) {
        Integer[] data = {9,1,2,8,4,3};

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 具体的策略
                return o1 > o2 ? 1 : -1;
            }
        };


        Arrays.sort(data, Comparator.naturalOrder());

        System.out.println(Arrays.toString(data));
    }
}
