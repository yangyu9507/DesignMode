package com.yaron.interpreter.expression.impl;

import com.yaron.interpreter.expression.Expression;

import java.util.HashMap;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 加法解释器
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 处理相加
     * @param var 仍然是 {a=10, b=20}
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        // super.left.interpreter(var): 返回 left 表达式对应 的 a = 10
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
