package com.yaron.memento.game;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class GameRole {


    /**
     * 攻击力
     */
    private int attack;

    /**
     * 防御力
     */
    private int defend;

    /**
     * 保存备忘录
     *
     * @return
     */
    public Memento save() {
        return new Memento(getAttack(), getDefend());
    }

    /**
     * 恢复对象的 初始状态
     *
     * @param memento
     */
    public void recover(Memento memento) {
        setAttack(memento.getAttack());
        setDefend(memento.getDefend());
    }

    public void display() {
        System.out.println("当前状态: " + this);
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "attack=" + attack +
                ", defend=" + defend +
                '}';
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefend() {
        return defend;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }
}
