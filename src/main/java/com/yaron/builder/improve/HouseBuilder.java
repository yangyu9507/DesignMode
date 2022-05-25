package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    // 建造流程
    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    // 房子好后,返回
    public House buildHouse() {
        return house;
    }

}
