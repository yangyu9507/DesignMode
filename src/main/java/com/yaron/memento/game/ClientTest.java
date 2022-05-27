package com.yaron.memento.game;


/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class ClientTest {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.setAttack(100);
        role.setDefend(100);
        Caretaker caretaker = new Caretaker(role.save());

        role.display();

        System.out.println("================== 开始大战 ================= ");
        role.setAttack(30);
        role.setDefend(30);

        System.out.println("================== 大战结束 ================= ");

        role.display();

        System.out.println("================== 开始恢复 ================= ");
        role.recover(caretaker.getMemento());
        System.out.println("================== 恢复完成 ================= ");

        role.display();
    }
}
