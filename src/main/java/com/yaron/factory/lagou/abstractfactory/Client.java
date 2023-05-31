package com.yaron.factory.lagou.abstractfactory;

import com.yaron.factory.lagou.abstractfactory.factory.AbstractFactory;
import com.yaron.factory.lagou.abstractfactory.factory.impl.ChinaFactory;
import com.yaron.factory.lagou.abstractfactory.factory.impl.UsaFactory;
import com.yaron.factory.lagou.abstractfactory.jiaju.Chair;

public class Client {

    public static void main(String[] args){
        AbstractFactory factory = new ChinaFactory();

        Chair china = factory.createChair();

        factory = new UsaFactory();

        Chair usa = factory.createChair();

        System.out.println(china);
        System.out.println(usa);

    }


}
