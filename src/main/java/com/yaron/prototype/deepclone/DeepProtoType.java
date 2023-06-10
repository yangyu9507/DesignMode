package com.yaron.prototype.deepclone;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

/**
 * @author 杨宇
 * @Date 2022-05-24
 * @Version 1.0
 * @Description
 */
@Data
@NoArgsConstructor
public class DeepProtoType implements Serializable,Cloneable {

    private static final long serialVersionUID = 7049613497521134388L;

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    /**
     * 深拷贝1 使用clone方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;

        deep = super.clone();
        // 对引用 类型的属性,DeepProtoType
        DeepProtoType deepProtoType = (DeepProtoType) deep;

        DeepCloneableTarget deepCloneableTarget1 = (DeepCloneableTarget)deepCloneableTarget.clone();

        deepProtoType.setDeepCloneableTarget(deepCloneableTarget1);

        return deepProtoType;
    }

    /**
     * 序列化
     *
     * @return
     */
    protected Object deepClone(){

        // 创建流对象
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        DeepProtoType copyObj =null;
        try {

            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copyObj = (DeepProtoType) ois.readObject();

        }catch (Exception ex){
            ex.printStackTrace();
        } finally {
            try {
                bos.close();
                bis.close();
                oos.close();
                ois.close();
            }catch (Exception ex){}
        }
        return copyObj;
    }

}
