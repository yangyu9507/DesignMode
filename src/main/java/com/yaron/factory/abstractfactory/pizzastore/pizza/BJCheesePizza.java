package com.yaron.factory.abstractfactory.pizzastore.pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class BJCheesePizza extends Pizza {
 @Override
 public void prepare() {
  setName("北京奶酪披萨");
  System.out.println(" 北京奶酪披萨准备原材料");
 }
}
