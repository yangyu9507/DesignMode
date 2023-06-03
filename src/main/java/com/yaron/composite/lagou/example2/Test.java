package com.yaron.composite.lagou.example2;

import com.yaron.composite.lagou.example2.impl.Leaf;
import com.yaron.composite.lagou.example2.impl.Node;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class Test {

    public static void main(String[] args) {
        AbstractNode rootNode = new Node();

        rootNode.setId(0);
        rootNode.setParentId(-1);

        AbstractNode node = new Node();
        node.setParentId(rootNode.getId());

        node.add(new Leaf());
        node.add(new Leaf());

        rootNode.add(node);

        System.out.println(node.getId());
    }
}
