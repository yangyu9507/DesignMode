package com.yaron.memento.lagou.example1;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description 备忘录对象
 */
public class Memento {

    private String state = "从备份对象恢复为原始对象";

    private Integer id;
    private String name;
    private String phone;

    public Memento(Integer id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public Memento setState(String state) {
        this.state = state;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Memento setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Memento setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Memento setPhone(String phone) {
        this.phone = phone;
        return this;
    }
}
