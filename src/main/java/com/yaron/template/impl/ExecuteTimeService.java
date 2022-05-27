package com.yaron.template.impl;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public abstract class ExecuteTimeService {

   public final void getExecuteTime(){

      long start = start();
      execute();
      long end = end();

      if (needStatics()){
         System.out.println("执行时间为: " + (end - start));
      } else {
         System.out.println("不需要执行时间");
      }

   }

   public abstract void execute();

   /**
    * 是否需要统计 代码执行时间
    * @return
    */
   public boolean needStatics(){
      return true;
   }

   public long start(){
      return System.currentTimeMillis();
   }

   public long end(){
      return System.currentTimeMillis();
   }
}
