package com.yaron.state;

import com.yaron.state.state.State;
import com.yaron.state.state.impl.CanRaffleState;
import com.yaron.state.state.impl.DispenseOutState;
import com.yaron.state.state.impl.DispenseState;
import com.yaron.state.state.impl.NoRaffleState;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class RaffleActivity {

    private State state;

    private int count = 0;

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    /**
     * @param count
     */
    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣除积分
     */
    public void debuctScore(){
        state.deduceScore();
    }

    /**
     * 抽奖成功,发奖品
     */
    public void raffle(){
        if (state.raffle()){
            state.dispensePrize();
        }
    }

    /**
     * 每领一次奖品后，减一
     * @return
     */
    public int getCount() {
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


}
