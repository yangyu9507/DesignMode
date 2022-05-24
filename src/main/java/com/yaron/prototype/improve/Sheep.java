package com.yaron.prototype.improve;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class Sheep implements Cloneable{

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

    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {

        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


}
