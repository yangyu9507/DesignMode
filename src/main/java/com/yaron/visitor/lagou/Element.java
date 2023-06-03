package com.yaron.visitor.lagou;

import lombok.Data;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Data
public abstract class Element {

    public Integer state;

    public abstract void accept(Visitor visitor);

}
