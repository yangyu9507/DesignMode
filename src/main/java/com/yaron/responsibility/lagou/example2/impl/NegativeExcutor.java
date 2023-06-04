package com.yaron.responsibility.lagou.example2.impl;

import com.yaron.responsibility.lagou.example2.Excutor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
@Slf4j
public class NegativeExcutor implements Excutor {

    private Excutor next;
    @Override
    public void setNext(Excutor next) {
        this.next = next;
    }

    @Override
    public void handle(Integer num) {
        if (null!= num && num < 0) {
            log.info("NegativeExcutor获取数字："+num+" ,处理完成！");
        } else {
            if (null != next) {
                log.info("===经过NegativeExcutor");
                next.handle(num);
            } else {
                log.info("处理中止！-NegativeExcutor");
            }
        }
    }
}
