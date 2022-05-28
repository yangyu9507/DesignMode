package com.yaron.interpreter;

import java.util.HashMap;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class ClientTest {

    public static void main(String[] args) {

        String expStr = "a+b-c";
        HashMap<String,Integer> var = new HashMap<>(){
            {
                put("a",10);
                put("b",20);
                put("c",6);
            }
        };

        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果 : " + expStr + " = " + calculator.run(var));
    }


}
