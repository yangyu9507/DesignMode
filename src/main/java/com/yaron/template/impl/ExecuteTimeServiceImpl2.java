package com.yaron.template.impl;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class ExecuteTimeServiceImpl2 extends ExecuteTimeService{
    @Override
    public void execute() {
        System.out.println("ExecuteTimeServiceImpl2 start .... ");
        try {
            Thread.sleep(200L);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("ExecuteTimeServiceImpl2 end .... ");
    }

    @Override
    public boolean needStatics() {
        return false;
    }
}
