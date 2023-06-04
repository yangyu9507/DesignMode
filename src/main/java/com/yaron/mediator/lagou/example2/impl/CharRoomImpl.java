package com.yaron.mediator.lagou.example2.impl;

import com.google.common.collect.Maps;
import com.yaron.mediator.lagou.example2.AbstractUser;
import com.yaron.mediator.lagou.example2.ChatRoom;

import java.util.Map;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class CharRoomImpl implements ChatRoom {

    private Map<Integer,AbstractUser> userMap = Maps.newConcurrentMap();

    @Override
    public void sendMsg(Integer sendUserId, Integer receiveUserId,String msg) {

        if (userMap.isEmpty()) return;
        if (!userMap.containsKey(receiveUserId)) return;

        AbstractUser user = userMap.get(receiveUserId);
        user.receive(sendUserId,msg);
    }

    @Override
    public void addUser(AbstractUser user) {
        userMap.put(user.getId(), user);
    }
}
