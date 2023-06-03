package com.yaron.visitor.lagou.example2;

import com.yaron.visitor.lagou.example2.impl.DLinkRouter;
import com.yaron.visitor.lagou.example2.impl.TPLinkRouter;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public interface RouterVisitor {

    void visit(DLinkRouter dLinkRouter);

    void visit(TPLinkRouter tpLinkRouter);

}
