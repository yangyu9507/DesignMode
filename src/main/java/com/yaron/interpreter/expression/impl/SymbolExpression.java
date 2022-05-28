package com.yaron.interpreter.expression.impl;

import com.yaron.interpreter.expression.Expression;

import java.util.HashMap;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 抽象运算符号解析器
 * 这里 每个运算符号 都只有自己左右两个数字有关系
 * 但左右两个数据有可能 也是一个解析的结果   无论何种类型 都是Expression类的实现类
 */
public class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 因为 SymbolExpreesion 是让其子类来实现
     * 因此interpreter是一个默认实现
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
