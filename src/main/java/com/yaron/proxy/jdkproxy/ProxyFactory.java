package com.yaron.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class ProxyFactory<T> {

    private final T target;

    public ProxyFactory(T target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // 1. ClassLoader 指定当前对象使用的类加载器，获取加载器的方法  固定
        //  2. Class<?> interfaces:  目标对象实现的接口类型，使用泛型方法确认类型
        // 3. InvocationHandler : 事件处理，执行目标对象的方法时，会触发事情处理器方法
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                     System.out.println("JDK代理开始...");
                     // 反射机制调用 目标方法
//                        System.out.println(method.getName());
                     Object returnObj = method.invoke(target, args);
                     System.out.println("JDK代理结束...");
                     return returnObj;
                    }
                });

    }
}
