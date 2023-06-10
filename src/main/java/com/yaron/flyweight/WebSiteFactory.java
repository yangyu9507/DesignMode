package com.yaron.flyweight;

import com.google.common.collect.Maps;
import java.util.Map;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class WebSiteFactory {

    public static WebSiteFactory webSiteFactory;

    /**
     * 资源池
     */
    private Map<String, ConcreteWebSite> pool = Maps.newConcurrentMap();

    private WebSiteFactory(){}

    public static WebSiteFactory getInstance(){

        if (null == webSiteFactory) {
            synchronized (WebSiteFactory.class) {
                if (null == webSiteFactory) {
                    webSiteFactory = new WebSiteFactory();
                }
            }
        }
        return webSiteFactory;
    }



    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
             pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }

}
