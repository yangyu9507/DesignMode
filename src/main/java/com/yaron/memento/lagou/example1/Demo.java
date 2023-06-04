package com.yaron.memento.lagou.example1;



/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Demo {

    public static void main(String[] args) {
        Originator ori = new Originator()
                .setId(1)
                .setName("mickjoust")
                .setPhone("12345566");

        System.out.println(ori);

        Memento m = ori.create();
        ori.setName("虚位以待");
        System.out.println(ori);

        ori.restore(m);

        System.out.println(ori);

    }
}
