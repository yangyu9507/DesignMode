package com.yaron.factory.abstractfactory.pizzastore.pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class LDCheesePizza extends Pizza {
 @Override
 public void prepare() {
  setName("伦敦奶酪披萨");
  System.out.println(" 伦敦奶酪披萨准备原材料");
 }
}
