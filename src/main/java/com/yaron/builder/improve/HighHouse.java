package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class HighHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
