package com.yaron.adapter.lagou;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 适配器类
 */
public class Adapter implements Service {

    private OtherClass otherClass;

    private ServiceImpl impl;

    public Adapter(OtherClass otherClass, ServiceImpl impl){
        this.otherClass = otherClass;
        this.impl = impl;
    }

    /**
     * filter保留了原来的功能
     *
     * @param str
     * @return
     */
    @Override
    public String filter(String str) {
        otherClass.preCheck(str); // 在filter中加入了新功能 preCheck

        return impl.filter(str);
    }
}
