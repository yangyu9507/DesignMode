package com.yaron.bridge.lagou.example2.impl;

import com.yaron.bridge.lagou.example2.FileAbstractBehavior;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class LinuxFileBehavior implements FileAbstractBehavior {

    @Override
    public Object updateFile(String path) {
        return null;
    }

    @Override
    public boolean checkFile(Object obj) {
        return false;
    }
}
