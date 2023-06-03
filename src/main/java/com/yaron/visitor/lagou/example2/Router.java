package com.yaron.visitor.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public interface Router {

    void sendData(char[] data);

    /**
     * 对象 接受不同的操作
     *
     * @param visitor
     */
    void accept(RouterVisitor visitor);

}
