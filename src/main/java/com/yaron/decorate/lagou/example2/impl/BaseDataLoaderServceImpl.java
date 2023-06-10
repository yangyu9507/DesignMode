package com.yaron.decorate.lagou.example2.impl;

import com.yaron.decorate.lagou.example2.DataLoaderService;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

import java.nio.charset.StandardCharsets;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
@Slf4j
public class BaseDataLoaderServceImpl implements DataLoaderService {

    public String filePath;

    public BaseDataLoaderServceImpl(String filePath){
        this.filePath = filePath;
    }

    @Override
    public String readFromFile() {
        char[] buffer = null;
        File file = new File(this.filePath);
        try (FileReader reader = new FileReader(file)){
            buffer = new char[(int)file.length()];
            reader.read(buffer);
        }catch (IOException e){
            log.error("BaseDataLoaderServceImpl read error.", e);
        }
        return new String(buffer);
    }

    @Override
    public void write2File(String data) {

        File file = new File(this.filePath);
        try(OutputStream fos = new FileOutputStream(file)){

            fos.write(data.getBytes(StandardCharsets.UTF_8), 0, data.length());
        }catch (IOException e){
            log.error("BaseDataLoaderServceImpl write error.", e);
        }
    }
}
