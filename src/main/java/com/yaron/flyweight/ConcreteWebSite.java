package com.yaron.flyweight;

/**
 * @author 杨宇
 * @Date 2022-05-26
 * @Version 1.0
 * @Description
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 网站发布的形式（类型）
     * 内部状态
     */
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    /**
     *
     * @param user 外部状态
     */
    @Override
    public void use(User user) {

     System.out.println("网站发布的形式: " + type+".  使用者是: " + user.getName());
    }

}
