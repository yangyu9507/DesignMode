package com.yaron.bridge.lagou.example2.extend;

import com.yaron.bridge.lagou.example2.FileAbstractBehavior;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 新的执行器,专门为 阿里云 华为云 腾讯云 文件执行的新操作
 */
public interface ExtentFileAbstractBehavior extends FileAbstractBehavior {

    /**
     * 新操作删除
     *
     * @return
     */
    boolean delete();

}
