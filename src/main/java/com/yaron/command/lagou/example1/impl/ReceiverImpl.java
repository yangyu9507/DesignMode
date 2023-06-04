package com.yaron.command.lagou.example1.impl;

import com.yaron.command.lagou.example1.Receiver;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description 具体接收者
 */
@Slf4j
public class ReceiverImpl implements Receiver {

    @Override
    public void insert() {

        log.info("====== 新增操作 ======");
    }

    @Override
    public void update() {
        log.info("====== 更新操作 ======");
    }

    @Override
    public void delete() {
        log.info("====== 删除操作 ======");
    }
}
