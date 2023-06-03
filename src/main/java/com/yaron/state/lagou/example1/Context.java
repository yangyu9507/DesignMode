package com.yaron.state.lagou.example1;

import com.yaron.state.lagou.example1.impl.StateA;
import lombok.Data;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Data
public class Context {

    private State currentState;

    public Context(State currentState) {
        this.currentState = currentState;
        if (null == currentState){
            this.currentState = StateA.getInstance();
        }
    }

    public void request(){
        currentState.handle(this);
    }


}
