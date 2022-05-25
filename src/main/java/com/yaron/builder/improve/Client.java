package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
     HouseDirector houseDirector = new HouseDirector();


        CommonHouse commonHouse = new CommonHouse();
         houseDirector.setHouseBuilder(commonHouse);
        houseDirector.constructHouse();

        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);

        houseDirector.constructHouse();

    }
}
