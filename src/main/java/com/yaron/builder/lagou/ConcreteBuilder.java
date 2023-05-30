package com.yaron.builder.lagou;

public class ConcreteBuilder implements Builder{

    private int partA;

    private String partB;

    private int partC;

    @Override
    public void buildA(int partA) {
        this.partA = partA;
    }

    @Override
    public void buildB(String partB) {
        this.partB = partB;
    }

    @Override
    public void buildC(int partC) {

        this.partC = partC;
    }

    @Override
    public Product getResult() {
    return Product.builder().partA(partA).partB(partB).partC(partC).build();
    }
}
