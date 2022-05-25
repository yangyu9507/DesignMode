package com.yaron.adapter.classadapter;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    /**
     * 适配器
     * @return
     */
    @Override
    public int output5V() {
        int src = output220V();
        int dst = src / 44;
        return dst;
    }

}
