package com.yaron.visitor;

import com.yaron.visitor.action.impl.FailAction;
import com.yaron.visitor.action.impl.SuccessAction;
import com.yaron.visitor.action.impl.WaitAction;
import com.yaron.visitor.person.impl.Man;
import com.yaron.visitor.person.impl.Woman;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new Man());
        structure.attach(new Woman());


        SuccessAction successAction = new SuccessAction();
        structure.display(successAction);

        FailAction failAction = new FailAction();
        structure.display(failAction);

        System.out.println("==================================");
        WaitAction
                waitAction = new WaitAction();
        structure.display(waitAction);


    }
}
