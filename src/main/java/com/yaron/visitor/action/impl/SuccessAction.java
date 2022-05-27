package com.yaron.visitor.action.impl;

import com.yaron.visitor.action.Action;
import com.yaron.visitor.person.impl.Man;
import com.yaron.visitor.person.impl.Woman;
import org.apache.commons.pool2.impl.AbandonedConfig;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class SuccessAction extends Action {
    @Override
    public void getManRes(Man man) {
        System.out.println("男人成功");
    }

    @Override
    public void getWomanRes(Woman woman) {
        System.out.println("女人成功");
    }
}
