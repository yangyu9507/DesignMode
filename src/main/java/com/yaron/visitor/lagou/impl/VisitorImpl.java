package com.yaron.visitor.lagou.impl;


import com.yaron.visitor.lagou.Element;
import com.yaron.visitor.lagou.Visitor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Slf4j
public class VisitorImpl implements Visitor {

    @Override
    public void visit(Element element) {

        Integer x = element.getState();
        x = x + 1;

        element.setState(x);
        log.info("========= 当前的state: {}", element.getState());
    }



}
