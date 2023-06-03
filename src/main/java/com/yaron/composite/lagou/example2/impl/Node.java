package com.yaron.composite.lagou.example2.impl;

import com.google.common.collect.Lists;
import com.yaron.composite.lagou.example2.AbstractNode;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class Node extends AbstractNode {

    private List<AbstractNode> children;
    private Integer id;
    private Integer parentId;

    public Node(){
        this.children = Lists.newArrayList();
    }

    @Override
    public boolean isRoot() {
        return ObjectUtils.nullSafeEquals(parentId, -1);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getParentId() {
        return parentId;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean add(AbstractNode newNode) {
        newNode.setParentId(this.parentId + children.size());
        newNode.setId(newNode.getParentId() + 1);
        return children.add(newNode);
    }

    @Override
    public boolean remove(AbstractNode abstractNode) {
        return children.remove(abstractNode);
    }

    @Override
    public AbstractNode getChild(Integer id) {
        return children.get(id);
    }
}
