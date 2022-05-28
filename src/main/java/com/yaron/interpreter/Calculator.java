package com.yaron.interpreter;

import com.yaron.interpreter.expression.Expression;
import com.yaron.interpreter.expression.impl.AddExpression;
import com.yaron.interpreter.expression.impl.MinusExpression;
import com.yaron.interpreter.expression.impl.VarExpression;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Calculator {

    private Expression expression;

    /**
     * 构建函数传参，并解析
     *
     * @param expStr
     */
    public Calculator(String expStr) {  // a + b - c

        Stack<Expression> stack = new Stack<>();

        char[] chars = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        for (int i = 0, len = chars.length; i < len; i++) {

            switch (chars[i]) {
                case '+':

                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;

                case '-':

                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new MinusExpression(left, right));
                    break;

                default:

                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        // 当遍历完整个 charArray 数组后, stack 就得到 最后Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
