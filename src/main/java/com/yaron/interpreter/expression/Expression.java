package com.yaron.interpreter.expression;

import java.util.HashMap;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 抽象类表达式 通过HashMap 键值对 可以获取到变量的值
 */
public abstract class Expression {

   /**
    * a + b - c
    * 解释公式 和数值, key 就是公式（表达式）参数[a,b,c]   value 就是具体值
    * HashMap {a=10,b=30}
    * @param var
    * @return
    */
   public abstract int interpreter(HashMap<String,Integer> var);
}
