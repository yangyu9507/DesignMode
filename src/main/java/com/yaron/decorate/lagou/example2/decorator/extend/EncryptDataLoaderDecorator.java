package com.yaron.decorate.lagou.example2.decorator.extend;

import com.yaron.decorate.lagou.example2.DataLoaderService;
import com.yaron.decorate.lagou.example2.decorator.DataLoaderDecorator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class EncryptDataLoaderDecorator extends DataLoaderDecorator {

    public EncryptDataLoaderDecorator(DataLoaderService dataLoaderService) {
        super(dataLoaderService);
    }

    @Override
    public String readFromFile() {
        return decrypt(super.readFromFile());
    }

    @Override
    public void write2File(String data) {
        super.write2File(encrypt(data));
    }

    private String encrypt(String data){
        byte[] res = data.getBytes(StandardCharsets.UTF_8);

        for (int idx = 0 , len = res.length; idx < len; idx++){
            res[idx] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(res);
    }


    private String decrypt(String data){
        byte[] res = Base64.getDecoder().decode(data);
        for (int idx = 0, len = res.length ; idx < len; idx++ ){
            res[idx] -= (byte)1;
        }
        return new String(res, StandardCharsets.UTF_8);
    }

}
