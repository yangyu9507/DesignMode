package com.yaron.factory.lagou.aaa.factory.impl;

import com.yaron.factory.lagou.aaa.factory.AbstractFactory;
import com.yaron.factory.lagou.aaa.jiaju.Chair;
import com.yaron.factory.lagou.aaa.jiaju.impl.ChinaChair;

public class ChinaFactory extends AbstractFactory {

  @Override
  public Chair createChair() {
    return new ChinaChair();
  }
}
