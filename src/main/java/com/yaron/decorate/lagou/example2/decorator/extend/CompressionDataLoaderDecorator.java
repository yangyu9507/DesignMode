package com.yaron.decorate.lagou.example2.decorator.extend;

import com.yaron.decorate.lagou.example2.DataLoaderService;
import com.yaron.decorate.lagou.example2.decorator.DataLoaderDecorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-03
 * @description
 */
public class CompressionDataLoaderDecorator extends DataLoaderDecorator {

    public CompressionDataLoaderDecorator(DataLoaderService dataLoaderService) {
        super(dataLoaderService);
    }

    @Override
    public void write2File(String data) {
        super.write2File(this.compress(data));
    }

    @Override
    public String readFromFile() {
        return this.decompress(super.readFromFile());
    }

    private String compress(String stringData) {
        byte[] data = stringData.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater());
            dos.write(data);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    private String decompress(String stringData) {
        byte[] data = Base64.getDecoder().decode(stringData);
        try {
            InputStream in = new ByteArrayInputStream(data);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
