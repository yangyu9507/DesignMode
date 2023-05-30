package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
     HouseDirector director = new HouseDirector();

         // 普通房子
        CommonHouse commonHouse = new CommonHouse();
        director.setHouseBuilder(commonHouse);
        director.constructHouse();
        System.out.println(commonHouse.getResult());

        // 高楼
        HighHouse highHouse = new HighHouse();
        director.setHouseBuilder(highHouse);

        director.constructHouse();
        System.out.println(highHouse.getResult());

    }
}
