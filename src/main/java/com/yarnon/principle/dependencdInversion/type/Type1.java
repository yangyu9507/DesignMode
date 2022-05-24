package com.yarnon.principle.dependencdInversion.type;


public class Type1 {

    public static void main(String[] args) {

        /*OpenAndClose openAndClose = new OpenAndClose();
        ITV itv = new MiTv();
        openAndClose.open(itv);*/

        /*ITV itv = new MiTv();
        OpenAndClose openAndClose = new OpenAndClose(itv);
        openAndClose.open();*/


        ITV itv = new MiTv();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(itv);
        openAndClose.open();

    }


}

class MiTv implements ITV {
    @Override
    public void play() {
        System.out.println("MiTv play....");
    }
}

/**
 * 通过接口传递实现依赖
 */
//interface IOpenAndClose {
//    void open(ITV tv);
//}
//
//interface ITV{
//    void play();
//}
//
//
//
//class OpenAndClose implements IOpenAndClose {
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//
//}


/**
 * 通过构造方法依赖传递
 */
//interface IOpenAndClose {
//    void open();
//}
//
//interface ITV{
//    void play();
//}
//
//class OpenAndClose implements IOpenAndClose{
//    private ITV tv;
//    public OpenAndClose(ITV tv){
//        this.tv = tv;
//    }
//    @Override
//    public void open() {
//      tv.play();
//    }
//}


/**
 * 通过 setter方法传递
 */
interface IOpenAndClose {
    void open();

    void setTv(ITV tv);
}

interface ITV{
    void play();
}

class OpenAndClose implements IOpenAndClose{

    private ITV tv;


    @Override
    public void open() {
        tv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}























