package com.yaron.builder.improve;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 抽象的建造者
 */
public interface HouseBuilder {

    default House initHouse(){
        return House.builder().build();
    }

     void buildBasic();

      void buildWall();

     void roofed();

     // 房子好后,返回
     House getResult() ;

}
