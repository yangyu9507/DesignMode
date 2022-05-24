package com.yaron.principle.Liskov;

public class Liskov {
}


class Base {

}

class A extends Base{
    public int fun1(int a, int b){
        return a - b;
    }
}

class B extends Base {

    /**
     * 聚合
     */
    A aa = new A();

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return a + b + 9;
    }

    public int fun3(int a, int b) {
        return this.aa.fun1(a,b);
    }

}