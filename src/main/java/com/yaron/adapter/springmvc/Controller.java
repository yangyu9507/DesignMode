package com.yaron.adapter.springmvc;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 多种Controller实现
 */
//
public interface Controller {

}

class HttpController implements Controller {

    public void doHttpHandler(){
        System.out.println("------------ doHttpHandler ----------");
    }
}

class SimpleController implements Controller {

    public void doSimpleHandler(){
        System.out.println("------------ doSimpleHandler ----------");
    }
}

class AnnotationController implements Controller {

    public void doAnnotationHandler(){
        System.out.println("------------ AnnotationController ----------");
    }
}

