package com.yaron.factory.lagou.abstractfactory.factory.impl;

import com.yaron.factory.lagou.abstractfactory.factory.AbstractFactory;
import com.yaron.factory.lagou.abstractfactory.jiaju.Chair;
import com.yaron.factory.lagou.abstractfactory.jiaju.impl.UsaChair;

public class UsaFactory extends AbstractFactory {

  @Override
  public Chair createChair() {
    return new UsaChair();
  }
}
