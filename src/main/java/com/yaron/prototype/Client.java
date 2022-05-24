package com.yaron.prototype;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class Client {

 public static void main(String[] args) {
  Sheep sheep1 = new Sheep("tom",1,"白色");
  Sheep sheep2 = new Sheep("tom",1,"白色");
  Sheep sheep3 = new Sheep("tom",1,"白色");
  Sheep sheep4= new Sheep("tom",1,"白色");
  Sheep sheep5 = new Sheep("tom",1,"白色");
  Sheep sheep6 = new Sheep("tom",1,"白色");

  System.out.println(sheep1);
  System.out.println(sheep2);
  System.out.println(sheep3);
  System.out.println(sheep4);
  System.out.println(sheep5);
 }
}
