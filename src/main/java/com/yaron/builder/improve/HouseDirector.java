package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 处理建造的流程,交给 HouseDirector
     *
     * @return
     */
    public void constructHouse(){

        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();


    }

}
