package com.yaron.builder.lagou;

public class Director {

    public void consturct(Builder builder){
        builder.buildA(1);
        builder.buildB("testB");
        builder.buildC(222);
    }

}
