package com.yaron.composite.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public abstract class AbstractNode {

    public abstract boolean isRoot();

    public abstract int getId();

    public abstract int getParentId();

    public abstract void setId(Integer id);

    public abstract void setParentId(Integer parentId);

    public abstract boolean add(AbstractNode abstractNode);

    public abstract boolean remove(AbstractNode abstractNode);

    public abstract AbstractNode getChild(Integer id);

}