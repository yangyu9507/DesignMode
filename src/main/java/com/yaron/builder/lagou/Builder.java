package com.yaron.builder.lagou;

public interface Builder {

    void buildA(int partA);

    void buildB(String partB);

    void buildC(int partC);

    Product getResult();

}
