package com.yarnon.principle.SingleResponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("摩托车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

/**
 * 方法上 遵守单一职责
 */
class Vehicle2{

    public void run(String type){
        System.out.println(type + " 在公路上跑...");
    }

    public void runWater(String type){
        System.out.println(type + " 在公路上跑...");
    }

    public void runAir(String type){
        System.out.println(type + " 在公路上跑...");
    }
}
