package com.yaron.adapter.lagou;

import lombok.NoArgsConstructor;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 适配者类
 */
@NoArgsConstructor
public class OtherClass {

    public String replace(String str){
        return str.replaceAll("<","[");
    }

    public void preCheck(String str){
        System.out.println("PreCheck: " + str);
    }
}
