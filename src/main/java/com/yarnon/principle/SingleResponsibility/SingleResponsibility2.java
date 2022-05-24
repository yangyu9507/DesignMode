package com.yarnon.principle.SingleResponsibility;

public class SingleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机..");
    }

}


class RoadVehicle {

    public void run(String type){
        System.out.println(type + " 在公路上跑...");
    }
}


class AirVehicle {

    public void run(String type){
        System.out.println(type + " 空中跑...");
    }
}
