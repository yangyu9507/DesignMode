package com.yaron.prototype.deepclone;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
public class Client {

    public static void main(String[] args) throws Exception {

        DeepProtoType protoType = new DeepProtoType();
        protoType.setName("宋江");
        protoType.setDeepCloneableTarget(new DeepCloneableTarget("大牛", "大年类"));

        DeepProtoType clone = (DeepProtoType) protoType.clone();
//        DeepProtoType clone = (DeepProtoType) protoType.deepClone();

        System.out.println(protoType.getDeepCloneableTarget().hashCode());
        System.out.println(clone.getDeepCloneableTarget().hashCode());

    }
}
