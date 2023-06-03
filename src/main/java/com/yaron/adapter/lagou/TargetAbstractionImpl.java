package com.yaron.adapter.lagou;

import lombok.NoArgsConstructor;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 适配器类
 */
@NoArgsConstructor
public class TargetAbstractionImpl extends TargetAbstraction {

    @Override
    public String filter(String str) {
        return str.replaceAll("a","A");
    }
}
