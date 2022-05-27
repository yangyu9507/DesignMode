package com.yaron.visitor;

import com.yaron.visitor.action.Action;
import com.yaron.visitor.person.Person;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description 数据结构 很多人
 */
public class ObjectStructure {

    /**
     * 维护了一个集合
     */
    private List<Person> persons = new LinkedList<>();

    /**
     * 移除
     *
     * @param p
     */
    public void attach(Person p) {
        persons.add(p);
    }

    /**
     * @param p
     */
    public void detach(Person p) {
        persons.remove(p);
    }

    /**
     * 显示测试情况
     *
     * @param action
     */
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }

}
