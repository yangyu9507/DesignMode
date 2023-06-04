package com.yaron.memento.lagou.example1;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description 原始对象
 */
public class Originator {

    private String state = "原始对象";
    private Integer id;
    private String name;
    private String phone;

    public Originator() {
    }

    public Memento create(){
        return new Memento(id,name, phone);
    }

    /**
     * 用于恢复对象状态
     *
     * @param m
     */
    public void restore(Memento m){

        this.id = m.getId();
        this.name = m.getName();
        this.phone = m.getPhone();
    }

    public String getState() {
        return state;
    }

    public Originator setState(String state) {
        this.state = state;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Originator setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Originator setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Originator setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
