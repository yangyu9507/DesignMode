package com.yaron.state.money.state.impl;

import com.yaron.state.money.Context;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class PublishState extends AbstractState{


 @Override
 public void acceptOrderEvent(Context context) {
  super.acceptOrderEvent(context);
 }

 @Override
 public void noPeopleAcceptEvent(Context context) {
  super.noPeopleAcceptEvent(context);
 }

 @Override
 public String getCurrentState() {
  return super.getCurrentState();
 }
}
