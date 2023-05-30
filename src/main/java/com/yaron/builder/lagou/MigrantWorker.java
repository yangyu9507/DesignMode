package com.yaron.builder.lagou;

import lombok.ToString;

@ToString
public class MigrantWorker {
 
    private String name;
    private int age;
    private String phone;
    private String gender;
    public MigrantWorker() {
    }
    public static MigrantWorker builder() {
        return new MigrantWorker();
    }
    
    public MigrantWorker name(String name) {
        this.name = name;
        return this;
    }
    
    public MigrantWorker age(int age) {
        this.age = age;
        return this;
    }
    
    public MigrantWorker phone(String phone) {
        this.phone = phone;
        return this;
    }
    
    public MigrantWorker gender(String gender) {
        this.gender = gender;
        return this;
    }
    //执行创建操作
    public MigrantWorker build() {
        validateObject(this);
        return this;
    }
    private void validateObject(MigrantWorker migrantWorker) {
        //可以做基础预校验，或自定义校验
    }

}
