package com.yaron.proxy.jdkproxy;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class TeacherDao implements ITeacherDao {


    @Override
    public void teach() {
        System.out.println("老师在授课");
    }

    @Override
    public String sayHello(String name) {
        String str = " sayHello to : " + name;
        System.out.println(" sayHello to : " + name);
        return "return : "+str;
    }
}
