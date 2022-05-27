package com.yaron.proxy.cglibproxy;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();

        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxy = (TeacherDao) proxyFactory.getProxyInstance();
        proxy.teach();

    }
}
