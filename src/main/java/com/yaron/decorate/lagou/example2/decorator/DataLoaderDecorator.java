package com.yaron.decorate.lagou.example2.decorator;

import com.yaron.decorate.lagou.example2.DataLoaderService;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description 基础装饰功能
 */
public class DataLoaderDecorator implements DataLoaderService {

    private DataLoaderService dataLoaderService;

    public DataLoaderDecorator(DataLoaderService dataLoaderService) {
        this.dataLoaderService = dataLoaderService;
    }

    @Override
    public String readFromFile() {
        return dataLoaderService.readFromFile();
    }

    @Override
    public void write2File(String data) {
        dataLoaderService.write2File(data);
    }
}
