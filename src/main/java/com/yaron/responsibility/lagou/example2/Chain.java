package com.yaron.responsibility.lagou.example2;

import com.yaron.responsibility.lagou.example2.impl.NegativeExcutor;
import com.yaron.responsibility.lagou.example2.impl.PositiveExcutor;
import com.yaron.responsibility.lagou.example2.impl.ZeroExcutor;
import org.checkerframework.checker.units.qual.C;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Chain {
    Excutor chain;
    public Chain(){

        buildChain();
    }
    private void buildChain(){
        Excutor e1 = new NegativeExcutor();
        Excutor e2 = new ZeroExcutor();
        Excutor e3 = new PositiveExcutor();
        e1.setNext(e2);
        e2.setNext(e3);
        this.chain = e1;
    }

    public void process(Integer number){
        chain.handle(number);
    }
}
