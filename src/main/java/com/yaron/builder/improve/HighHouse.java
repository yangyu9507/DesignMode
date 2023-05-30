package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class HighHouse implements HouseBuilder{

    private House house;

    public HighHouse() {
        this.house = initHouse();
    }

    @Override
    public void buildBasic() {
        house.setBasic("高楼打地基");
    }

    @Override
    public void buildWall() {
          house.setWall("高楼砌墙");
    }

    @Override
    public void roofed() {
          house.setRoofed("高楼封顶" );
    }

    @Override
    public House getResult() {
        return house;
    }
}
