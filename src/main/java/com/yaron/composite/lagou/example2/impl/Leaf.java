package com.yaron.composite.lagou.example2.impl;

import com.yaron.composite.lagou.example2.AbstractNode;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 叶子节点
 */
public class Leaf extends AbstractNode {

    private Integer id;
    private Integer parentId;

    @Override
    public boolean isRoot() {
        return false;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int getParentId() {
        return this.parentId;
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
    public boolean add(AbstractNode abstractNode) {
        throw new UnsupportedOperationException("这个是叶子节点,无法增加");
    }

    @Override
    public boolean remove(AbstractNode abstractNode) {
        throw new UnsupportedOperationException("这个是叶子节点,无法删除");
    }

    @Override
    public AbstractNode getChild(Integer id) {
        return null;
    }
}
