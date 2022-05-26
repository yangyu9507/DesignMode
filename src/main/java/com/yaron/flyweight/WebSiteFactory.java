package com.yaron.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class WebSiteFactory {

    /**
     * 资源池
     */
    private Map<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }


}
