package com.yaron.factory.lagou.abstractfactory.factory.impl;

import com.yaron.factory.lagou.abstractfactory.factory.AbstractFactory;
import com.yaron.factory.lagou.abstractfactory.jiaju.Chair;
import com.yaron.factory.lagou.abstractfactory.jiaju.impl.ChinaChair;

public class ChinaFactory extends AbstractFactory {

  @Override
  public Chair createChair() {
    return new ChinaChair();
  }
}
