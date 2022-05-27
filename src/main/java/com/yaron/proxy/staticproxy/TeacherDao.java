package com.yaron.proxy.staticproxy;

import com.yaron.proxy.staticproxy.ITeacherDao;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中...");
    }
}
