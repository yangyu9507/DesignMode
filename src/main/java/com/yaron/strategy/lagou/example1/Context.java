package com.yaron.strategy.lagou.example1;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 上下文信息类 用于存放和执行需要使用的具体策略类以及客户端调用的逻辑
 */
public class Context {

    public void request(Strategy strategy){
        strategy.operation();
    }

}
