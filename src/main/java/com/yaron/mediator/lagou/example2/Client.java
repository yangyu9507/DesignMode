package com.yaron.mediator.lagou.example2;

import com.yaron.mediator.lagou.example2.impl.CharRoomImpl;
import com.yaron.mediator.lagou.example2.impl.ChatUser;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Client {

    public static void main(String[] args) {
        ChatRoom chatRoom = new CharRoomImpl();

        AbstractUser use1;
        AbstractUser use2;
        AbstractUser use3;
        AbstractUser use4;
        chatRoom.addUser(use1 =new ChatUser(chatRoom,1,"Spike"));
        chatRoom.addUser(use2 =new ChatUser(chatRoom,2,"Mia"));
        chatRoom.addUser(use3 =new ChatUser(chatRoom,3,"Max"));
        chatRoom.addUser(use4= new ChatUser(chatRoom,4,"Jerry"));

        use1.send(2,"你好");
        use4.send(3,"sfsdfa");

    }
}
