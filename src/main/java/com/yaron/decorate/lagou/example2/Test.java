package com.yaron.decorate.lagou.example2;

import com.yaron.decorate.lagou.example2.decorator.DataLoaderDecorator;
import com.yaron.decorate.lagou.example2.decorator.extend.CompressionDataLoaderDecorator;
import com.yaron.decorate.lagou.example2.decorator.extend.EncryptDataLoaderDecorator;
import com.yaron.decorate.lagou.example2.impl.BaseDataLoaderServceImpl;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class Test {

    public static void main(String[] args) {
        String tesInfo = "hello";
        String filePath = "demo2.txt";
        /*DataLoaderDecorator compression = new CompressionDataLoaderDecorator(
                   new BaseDataLoaderServceImpl(filePath));

        compression.write2File(tesInfo);
        String s = compression.readFromFile();
        System.out.println(s);*/

        /*DataLoaderDecorator encrypt = new EncryptDataLoaderDecorator(
                new BaseDataLoaderServceImpl(filePath));

        encrypt.write2File(tesInfo);
        System.out.println(encrypt.readFromFile());*/

        // 先 压缩 再加密
        // TODO 可以通过 不同的 排列组合  不同的顺序 来实现功能
        DataLoaderDecorator compressonAndencrypt =
                new CompressionDataLoaderDecorator(
                        new EncryptDataLoaderDecorator(
                                new BaseDataLoaderServceImpl(filePath)
                        )
                );

        compressonAndencrypt.write2File(tesInfo);
        System.out.println(compressonAndencrypt.readFromFile());

    }
}
