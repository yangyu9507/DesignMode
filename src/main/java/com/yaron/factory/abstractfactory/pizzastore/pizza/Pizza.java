package com.yaron.factory.abstractfactory.pizzastore.pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public abstract class Pizza {

    protected String name;

    /**
     * 准备原材料
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking.");
    }

    public void cut() {
        System.out.println(name + " cutting.");
    }

    public void box() {
        System.out.println(name + " boxting.");
    }

    public void setName(String name) {
        this.name = name;
    }
}
