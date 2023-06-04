package com.yaron.mediator.lagou.example2.impl;

import com.yaron.mediator.lagou.example2.AbstractUser;
import com.yaron.mediator.lagou.example2.ChatRoom;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
@Slf4j
public class ChatUser extends AbstractUser {

    public ChatUser(ChatRoom mediator, Integer id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void send(Integer userId, String msg) {

        log.info("用户{} 发送给用户{} 消息:{}",this.getId(), userId, msg);
        getMediator().sendMsg(this.getId(),userId, msg);
    }

    @Override
    public void receive(Integer userId,String msg) {

        log.info("用户{} 收到 来自用户{} 的消息:{}", this.getId(), userId, msg);

    }
}
