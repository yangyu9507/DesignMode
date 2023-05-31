package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class CommonHouse implements HouseBuilder {

    private final House house;

    public CommonHouse() {
        this.house = initHouse();
    }

    @Override
    public void buildBasic() {
        this.house.setBasic("普通房子打地基");
    }

    @Override
    public void buildWall() {
        this.house.setWall("普通房子砌墙");
    }

    @Override
    public void roofed() {
        this.house.setRoofed("普通房子封顶");
    }

    @Override
    public House getResult() {
        return house;
    }
}
