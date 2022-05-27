package com.yaron.template;

/**
 * @author 杨宇
 * @Date 2022-05-27
 * @Version 1.0
 * @Description
 */
public abstract class SoyaMilk {

    //模板方法，不允许覆盖
    public final void make() {

        select();
        if (isAdd()) {
            add();
        }
        soak();
        beat();
    }

    /**
     * 添加配料
     */
    public abstract void add();

    /**
     * 子类选择是否调用 ，默认是调用的
     * @return
     */
    public boolean isAdd(){
        return true;
    }

    public void select() {
        System.out.println("第一步: 选材");
    }



    public void soak() {
        System.out.println("第三步: 浸泡");
    }

    public void beat() {
        System.out.println("第四步: 打机..");
    }
}
