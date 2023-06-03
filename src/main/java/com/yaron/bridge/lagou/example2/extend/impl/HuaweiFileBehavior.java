package com.yaron.bridge.lagou.example2.extend.impl;

import com.yaron.bridge.lagou.example2.extend.ExtentFileAbstractBehavior;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class HuaweiFileBehavior implements ExtentFileAbstractBehavior {
    @Override
    public Object updateFile(String path) {
        return null;
    }

    @Override
    public boolean checkFile(Object obj) {
        return false;
    }

    /**
     * 新操作删除
     *
     * @return
     */
    @Override
    public boolean delete() {
        return false;
    }
}
