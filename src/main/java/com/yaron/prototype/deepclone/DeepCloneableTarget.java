package com.yaron.prototype.deepclone;

import java.io.Serializable;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class DeepCloneableTarget implements Serializable,Cloneable {


    private static final long serialVersionUID = -2854149381688693250L;

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 默认的 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
