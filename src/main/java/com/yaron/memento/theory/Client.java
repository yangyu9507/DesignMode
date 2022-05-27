package com.yaron.memento.theory;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();


        originator.setState("state#1");

        caretaker.add(originator.saveStateMemento());

        originator.setState("state#2");

        caretaker.add(originator.saveStateMemento());

        originator.setState("state#3");

        caretaker.add(originator.saveStateMemento());

     System.out.println("当前状态: " + originator.getState());

     originator.getStateFromMemento(caretaker.get(1));

     System.out.println("恢复后的状态: " + originator.getState());

    }
}
