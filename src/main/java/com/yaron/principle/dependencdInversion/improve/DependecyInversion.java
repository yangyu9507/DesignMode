package com.yaron.principle.dependencdInversion.improve;

public class DependecyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }

}

class Person {
    public void receive(iReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}

interface iReceiver {

    String getInfo();

}

class Email implements iReceiver{

    public String getInfo(){
        return "电子邮件信息: hello world.";
    }
}

class WeChat implements iReceiver {

    @Override
    public String getInfo() {
        return "微信消息...";
    }
}
