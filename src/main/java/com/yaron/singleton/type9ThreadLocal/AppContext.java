package com.yaron.singleton.type9ThreadLocal;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 *  在线程内算唯一单例也是可以的，不必太纠结是不是一定要全局唯一。因为有时全局唯一反而会带来引用冲突的问题
 */
public class AppContext {

    private static final ThreadLocal<AppContext> local = new ThreadLocal<>();

    private Map<String,Object> data = Maps.newHashMap();

    public Map<String,Object> getData(){
        return getAppContent().data;
    }

    /**
     * 批量存数据
     *
     * @param data
     */
    public void setData(Map<String,Object> data){
        getAppContent().data.putAll(data);
    }

    /**
     * 存数据
     *
     * @param key
     * @param value
     */
    public void set(String key, String value){
        getAppContent().data.put(key, value);
    }

    /**
     * 取数据
     *
     * @param key
     */
    public void get(String key){
        getAppContent().data.get(key);
    }

    /**
     * 初始化的实现方法
     *
     * @return
     */
    private static AppContext init(){
        AppContext context = new AppContext();
        local.set(context);
        return context;
    }

    /**
     * 做延迟初始化
     *
     * @return
     */
    public static AppContext getAppContent(){
        AppContext context = local.get();
        if (null == context) context = init();
        return context;
    }

    /**
     * 删除实例
     */
    public static void remove(){
        local.remove();
    }

}
