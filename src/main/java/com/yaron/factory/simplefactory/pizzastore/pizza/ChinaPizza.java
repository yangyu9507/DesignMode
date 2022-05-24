package com.yaron.factory.simplefactory.pizzastore.pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class ChinaPizza extends Pizza{
 @Override
 public void prepare() {
  System.out.println("给中国披萨准备材料....");
 }
}
