package com.yaron.interpreter.expression.impl;

import com.yaron.interpreter.expression.Expression;

import java.util.HashMap;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 变量的解释器
 */
public class VarExpression extends Expression {

    /**
     * key =a ,key = b, key = c
     */
    private String key;


    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量值 拿到对应 的值
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
