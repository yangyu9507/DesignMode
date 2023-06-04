package com.yaron.responsibility.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public interface Excutor {

    void setNext(Excutor next);

    void handle(Integer num);

}
