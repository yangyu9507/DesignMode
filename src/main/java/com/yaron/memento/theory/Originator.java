package com.yaron.memento.theory;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Originator {

    /**
     * 状态信息
     */
    private String state;

    public Memento saveStateMemento() {
        return new Memento(getState());
    }

    public void getStateFromMemento(Memento memento) {
        setState(memento.getState());
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
