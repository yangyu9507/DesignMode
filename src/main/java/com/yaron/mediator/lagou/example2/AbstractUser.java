package com.yaron.mediator.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public abstract class AbstractUser {
    private ChatRoom mediator;
    private Integer id;
    private String name;

    public AbstractUser(ChatRoom mediator, Integer id, String name) {
        this.mediator = mediator;
        this.id = id;
        this.name = name;
    }

    public abstract void send(Integer userId, String msg);

    public abstract void receive(Integer userId, String msg);

    public ChatRoom getMediator() {
        return mediator;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
