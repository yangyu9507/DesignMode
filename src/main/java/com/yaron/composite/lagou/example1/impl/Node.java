package com.yaron.composite.lagou.example1.impl;

import com.yaron.composite.lagou.example1.Component;

import java.util.List;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 组合节点
 */
public class Node extends Component {

    // 存放子节点列表
    private List<Component> myChildren;

    @Override
    public void operation() {

        if (myChildren.isEmpty()) return;
        myChildren.forEach(Component::operation);
    }
}
