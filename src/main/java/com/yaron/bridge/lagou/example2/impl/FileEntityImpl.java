package com.yaron.bridge.lagou.example2.impl;

import com.yaron.bridge.lagou.example2.FileAbstractBehavior;
import com.yaron.bridge.lagou.example2.FileAbstractEntity;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class FileEntityImpl implements FileAbstractEntity {

    private FileAbstractBehavior abstractBehavior;

    public FileEntityImpl(FileAbstractBehavior abstractBehavior){
        this.abstractBehavior = abstractBehavior;
    }

    @Override
    public Object update(String path) {
        return abstractBehavior.updateFile(path);
    }

    @Override
    public boolean check(Object obj) {
        return abstractBehavior.checkFile(obj);
    }
}
