package com.yaron.mediator.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public interface ChatRoom {

    void sendMsg(Integer sendUserId, Integer receiveUserId,String msg);

    void addUser(AbstractUser user);

}
