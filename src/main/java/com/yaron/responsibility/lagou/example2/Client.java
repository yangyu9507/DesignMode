package com.yaron.responsibility.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Client {


    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.process(99);
        System.out.println("===================================");
        chain.process(-11);
        System.out.println("===================================");
        chain.process(null);
    }
}
