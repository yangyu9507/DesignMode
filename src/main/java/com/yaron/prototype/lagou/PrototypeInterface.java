package com.yaron.prototype.lagou;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-05-31
 * @description
 */
public interface PrototypeInterface extends Cloneable{

    PrototypeInterface clone() throws CloneNotSupportedException;

}
