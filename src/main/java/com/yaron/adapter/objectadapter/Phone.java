package com.yaron.adapter.objectadapter;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Phone {

    /**
     * 传入 目标接口
     * @param iVoltage5V
     */
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("5V可以充电");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("大于5V不可以充电");
        }
    }
}
