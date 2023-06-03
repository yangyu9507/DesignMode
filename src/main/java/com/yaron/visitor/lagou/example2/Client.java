package com.yaron.visitor.lagou.example2;

import com.yaron.visitor.lagou.example2.impl.DLinkRouter;
import com.yaron.visitor.lagou.example2.impl.LinuxRouterVisitor;
import com.yaron.visitor.lagou.example2.impl.TPLinkRouter;
import com.yaron.visitor.lagou.example2.impl.WindowsRouterVisitor;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class Client {

    public static void main(String[] args) {
        // 不同的操作
        LinuxRouterVisitor linuxRouterVisitor= new LinuxRouterVisitor();
        WindowsRouterVisitor windowsRouterVisitor = new WindowsRouterVisitor();

        // 不同的对象
        DLinkRouter dLinkRouter = new DLinkRouter();
        dLinkRouter.accept(linuxRouterVisitor);
        dLinkRouter.accept(windowsRouterVisitor);

        TPLinkRouter tpLinkRouter = new TPLinkRouter();
        tpLinkRouter.accept(linuxRouterVisitor);
        tpLinkRouter.accept(windowsRouterVisitor);
    }
}
