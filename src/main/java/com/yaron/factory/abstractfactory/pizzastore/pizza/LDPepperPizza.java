package com.yaron.factory.abstractfactory.pizzastore.pizza;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class LDPepperPizza extends Pizza {
 @Override
 public void prepare() {
  setName("伦敦胡椒披萨");
  System.out.println(" 伦敦胡椒披萨准备原材料");
 }
}
