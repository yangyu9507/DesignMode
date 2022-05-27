package com.yaron.memento.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Caretaker {

    // 只保存一次状态
    private Memento memento;

    // 保存 多次状态
    private List<Memento> mementoList = new ArrayList<>();

    // 多个数据 需要保存状态
    private Map<String,List<Memento>> map = new HashMap<>();

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
