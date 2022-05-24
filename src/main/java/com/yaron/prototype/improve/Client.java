package com.yaron.prototype.improve;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class Client {

 public static void main(String[] args) {
  System.out.println("原型模式");
  Sheep sheep = new Sheep("jack",2,"白色");
  Sheep sheep2 = (Sheep) sheep.clone();
  Sheep sheep3 = (Sheep) sheep.clone();
  Sheep sheep4 = (Sheep) sheep.clone();
  Sheep sheep5 = (Sheep) sheep.clone();
  System.out.println(sheep);
  System.out.println(sheep2);
  System.out.println(sheep3);
  System.out.println(sheep4);
  System.out.println(sheep5);
 }
}
