package com.yaron.state.lagou.example1.impl;

import com.yaron.state.lagou.example1.Context;
import com.yaron.state.lagou.example1.State;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Slf4j
@NoArgsConstructor
public class StateA implements State {

    private static StateA instance = new StateA();

    public static StateA getInstance(){
        return instance;
    }

    @Override
    public void handle(Context context) {

        log.info("============ 进入状态 A。。。。。。。。。。。。。。。");
        context.setCurrentState(StateB.getInstance());
    }

}
