package com.yaron.state.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class Test {

    public static void main(String[] args) {
        PackageContext context = new PackageContext(null, "123");

        context.update();
        context.update();
        context.update();
        context.update();
        context.update();
        context.update();


    }
}
