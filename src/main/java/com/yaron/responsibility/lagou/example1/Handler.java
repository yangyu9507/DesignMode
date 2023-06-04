package com.yaron.responsibility.lagou.example1;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public interface Handler {

    void setNext(Handler handler);

    void handle(Request request);

}
