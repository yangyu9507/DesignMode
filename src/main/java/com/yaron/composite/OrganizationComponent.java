package com.yaron.composite;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
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

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
