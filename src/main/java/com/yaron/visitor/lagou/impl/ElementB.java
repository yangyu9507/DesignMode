package com.yaron.visitor.lagou.impl;

import com.yaron.visitor.lagou.Element;
import com.yaron.visitor.lagou.Visitor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Data
@Slf4j

public class ElementB extends Element {

    @Override
    public void accept(Visitor visitor) {

        log.info("======= 开始访问元素B ....");
        visitor.visit(this);
    }

}
