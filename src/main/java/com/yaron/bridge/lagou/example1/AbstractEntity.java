package com.yaron.bridge.lagou.example1;

import com.yaron.bridge.lagou.example1.AbstractBehavior;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 抽象实体
 */
public abstract class AbstractEntity {

    // 行为对象
    protected AbstractBehavior abstractBehavior;

    // 实体 与 行为 的关联
    public AbstractEntity(AbstractBehavior abstractBehavior){
        this.abstractBehavior = abstractBehavior;
    }

    // 子类需要实现的抽象方法
    public abstract void request();

}
