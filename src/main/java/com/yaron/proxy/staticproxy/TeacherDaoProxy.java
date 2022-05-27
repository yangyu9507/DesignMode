package com.yaron.proxy.staticproxy;

import com.yaron.proxy.staticproxy.ITeacherDao;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理 ...");
        target.teach();
        System.out.println("代理结束 ...");
    }

}
