package com.yaron.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description 统一管理 备忘录对象 和 原始数据对象
 */
public class Caretaker {

    /**
     * 很多 备忘录对象
     */
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int idx){
        return mementoList.get(idx);
    }
}
