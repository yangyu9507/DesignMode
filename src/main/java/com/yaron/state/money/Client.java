package com.yaron.state.money;

import com.yaron.state.money.state.impl.PublishState;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        // 当前状态 为发布
        context.setState(new PublishState());

        context.acceptOrderEvent(context);

        context.payOrderEvent(context);
    }
}
