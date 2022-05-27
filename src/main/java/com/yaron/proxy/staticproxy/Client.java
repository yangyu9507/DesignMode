package com.yaron.proxy.staticproxy;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy proxy = new TeacherDaoProxy(teacherDao);
        proxy.teach();

    }
}
