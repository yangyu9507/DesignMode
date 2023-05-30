package com.yaron.builder.lagou;

public class Main {

    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();

        Director director = new Director();
        director.consturct(builder);

        System.out.println(builder.getResult());
    }
}
