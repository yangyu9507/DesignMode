package com.yaron.builder.lagou;

public class Product {

    private int partA;

    private String partB;

    private int partC;

    public static Product builder(){
        return new Product();
    }

    public int getPartA() {
        return partA;
    }

    public Product partA(int partA) {
        this.partA = partA;
        return this;
    }

    public String getPartB() {
        return partB;
    }

    public Product partB(String partB) {
        this.partB = partB;
        return this;
    }

    public int getPartC() {
        return partC;
    }

    public Product partC(int partC) {
        this.partC = partC;
        return this;
    }

    public Product build(){
        return this;
    }
}
