package com.yaron.mediator.lagou.example1.impl;

import com.yaron.mediator.lagou.example1.Component;
import com.yaron.mediator.lagou.example1.Mediator;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
@Slf4j
public class ComponentA extends Component {

    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void exec(String key) {

        log.info("===== 在组件A中，通过中介者执行");
        getMediator().apply(key);
    }
}
