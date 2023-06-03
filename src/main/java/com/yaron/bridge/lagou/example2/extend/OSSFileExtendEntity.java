package com.yaron.bridge.lagou.example2.extend;

import com.yaron.bridge.lagou.example2.FileAbstractEntity;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 新扩展的文件实体类, 实现了原来的 文件实体抽象方法
 */
public class OSSFileExtendEntity implements FileAbstractEntity {

    private ExtentFileAbstractBehavior newFileBehavior;

    public OSSFileExtendEntity(ExtentFileAbstractBehavior abstractBehavior){

        this.newFileBehavior = abstractBehavior;
    }

    @Override
    public Object update(String path) {
        return newFileBehavior.updateFile(path);
    }

    @Override
    public boolean check(Object obj) {
        return newFileBehavior.checkFile(obj);
    }

    /**
     * 新的文件实现
     *
     * @return
     */
    public boolean del(){
        return newFileBehavior.delete();
    }
}
