package com.yaron.bridge;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) {

        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        UpRightPhone upRightPhone = new UpRightPhone(new XiaoMi());
        upRightPhone.open();
        upRightPhone.call();
        upRightPhone.close();

    }
}
