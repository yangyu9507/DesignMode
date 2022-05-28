package com.yaron.responsibility.approver;

import com.yaron.responsibility.PurchaseRequest;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public abstract class Approver {

    protected Approver nextApprover;  // 下一个处理者
    protected String name;            // 名字

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 下一个处理者
     * @param nextApprover
     */
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    /**
     * 处理请求
     *
     * @param purchaseRequest
     */
    public abstract void procesRequest(PurchaseRequest purchaseRequest);
}
