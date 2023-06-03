package com.yaron.flyweight.lagou;

import com.google.common.collect.Maps;
import com.yaron.flyweight.lagou.impl.ConcreteFlyweight;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 享元工厂类
 */
@Slf4j
public class FlyweightFactory {

    // 定义一个池 容器
    public Map<String,Flyweight> pool;

    public FlyweightFactory() {
        this.pool = Maps.newLinkedHashMap();
        pool.put("A",new ConcreteFlyweight("A")); // 将对应 的内部状态添加进去
        pool.put("B",new ConcreteFlyweight("B"));
        pool.put("C",new ConcreteFlyweight("C"));
        pool.put("D",new ConcreteFlyweight("D"));
    }

    /**
     * 根据内部状态来查找值
     *
     * @param uniqueKey
     * @return
     */
    public Flyweight getFlyweight(String uniqueKey){
        if (StringUtils.isEmpty(uniqueKey)) return null;

        if (pool.containsKey(uniqueKey)){
            log.info("==== 享元池中有, 直接复用, key:{}", uniqueKey);
            return pool.get(uniqueKey);
        }

        log.info("==== 享元池中没有, 重新创建并复用,key:{}",uniqueKey);
        Flyweight flyweight = new ConcreteFlyweight(uniqueKey);
        pool.put(uniqueKey, flyweight);
        return flyweight;
    }

}
