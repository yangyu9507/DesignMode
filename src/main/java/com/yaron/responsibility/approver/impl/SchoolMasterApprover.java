package com.yaron.responsibility.approver.impl;

import com.yaron.responsibility.PurchaseRequest;
import com.yaron.responsibility.approver.Approver;

/**
 * @author 杨宇
 * @Date 2022-05-28
 * @Version 1.0
 * @Description
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void procesRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 30000) {
            System.out.println(purchaseRequest.getId() + " 被 " + this.name + " 处理了.");
        } else {
            nextApprover.procesRequest(purchaseRequest);
        }
    }
}
