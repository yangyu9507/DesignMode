package com.yaron.memento.game;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class Memento {

    /**
     * 攻击力
     */
    private int attack;

    /**
     * 防御力
     */
    private int defend;


    public Memento(int attack, int defend) {
        this.attack = attack;
        this.defend = defend;
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
