package com.yaron.flyweight;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class Client {

 public static void main(String[] args) {
  WebSiteFactory factory = new WebSiteFactory();
  WebSite webSite1 = factory.getWebSiteCategory("新闻");

  webSite1.use(new User("张三"));


  WebSite webSite2 = factory.getWebSiteCategory("博客");
  webSite2.use(new User("李四"));


  WebSite webSite3 = factory.getWebSiteCategory("博客");
  webSite3.use(new User("王五"));


  System.out.println(factory.getWebSiteCount());


 }
}
