package com.yarnon.principle.SingleResponsibility;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("飞机");
        vehicle.run("汽车");
    }
}


class Vehicle {

    public void run(String type){
        System.out.println(type + " 在公路上跑...");
    }
}
