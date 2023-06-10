package com.yaron.prototype.improve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
@ToString
public class Sheep implements Cloneable{

    private String name;
    private int age;
    private String color;

    /**
     * 使用默认的clone方法来完成
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        }catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }
        return sheep;
    }

}
