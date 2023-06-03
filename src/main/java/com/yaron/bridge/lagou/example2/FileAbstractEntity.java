package com.yaron.bridge.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 文件抽象实体
 */
public interface FileAbstractEntity {

    Object update(String path);

    boolean check(Object obj);
}
