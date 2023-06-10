package com.yaron.proxy.jdkproxy;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        // 创建目标对象
        ITeacherDao dao = new TeacherDao();

        // 给目标对象 创建代理对象  可以转成ITeacherDao
        ProxyFactory<ITeacherDao> factory = new ProxyFactory<>(dao);
        Object proxyInstance = factory.getProxyInstance();
        // com.yaron.proxy.jdkproxy.TeacherDao@4566e5bd
//        System.out.println(proxyInstance);
        // class com.sun.proxy.$Proxy0
//        System.out.println(proxyInstance.getClass());

        ITeacherDao proxyDao = (ITeacherDao)proxyInstance;
//        proxyDao.teach();
     String jack = proxyDao.sayHello("jack");
     System.out.println(jack);
    }
}
