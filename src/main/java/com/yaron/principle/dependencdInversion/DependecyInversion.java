package com.yaron.principle.dependencdInversion;

public class DependecyInversion {

    public static void main(String[] args) {

        Person person = new Person();
        person.receive(new Email());
    }

}

class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

class Email {

    public String getInfo(){
        return "电子邮件信息: hello world.";
    }
}
