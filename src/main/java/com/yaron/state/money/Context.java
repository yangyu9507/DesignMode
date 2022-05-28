package com.yaron.state.money;

import com.yaron.state.money.state.State;
import com.yaron.state.money.state.impl.AbstractState;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Context extends AbstractState {

    /**
     * 当前的状态 state,
     * 根据业务流程处理 不停的变化
     */
    private State state;

    @Override
    public void checkEvent(Context context) {

        state.checkEvent(this);
        getCurrentState();
    }

    @Override
    public void checkFailEvent(Context context) {
        state.checkFailEvent(this);
        getCurrentState();
    }

    @Override
    public void makePriceEvent(Context context) {
        state.makePriceEvent(this);
    }

    @Override
    public void acceptOrderEvent(Context context) {
        state.acceptOrderEvent(this);
        getCurrentState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
