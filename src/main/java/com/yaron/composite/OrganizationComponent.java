package com.yaron.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
public abstract class OrganizationComponent {

    private String name;

    private String desc;

    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }


    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public abstract void print();

}
