package com.yaron.interpreter.expression.impl;

import com.yaron.interpreter.expression.Expression;

import java.util.HashMap;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 减法解释器
 */
public class MinusExpression extends SymbolExpression {
    public MinusExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
