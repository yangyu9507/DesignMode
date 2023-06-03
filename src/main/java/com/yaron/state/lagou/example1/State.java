package com.yaron.state.lagou.example1;

import com.yaron.state.lagou.example1.Context;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public interface State {

    void handle(Context context);

}
