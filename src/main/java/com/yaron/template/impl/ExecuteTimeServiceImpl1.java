package com.yaron.template.impl;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class ExecuteTimeServiceImpl1 extends ExecuteTimeService {
    @Override
    public void execute() {
        System.out.println("ExecuteTimeServiceImpl1 start .... ");
        try {

            Thread.sleep(100L);
        } catch (Exception ex) {

        }
        System.out.println("ExecuteTimeServiceImpl1 end .... ");
    }
}
