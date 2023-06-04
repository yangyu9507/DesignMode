package com.yaron.memento.lagou.example2;

/**
 * @author Yaron
 * @version 1.0
 * @date 2023-06-04
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Blog blog = new Blog(1L,"My Blog");

        blog.setContent("ABC");

        System.out.println("原始文章: "+blog);

        BlogMemento backUp = blog.createBackUp();

        blog.setContent("123");
        System.out.println("修改后："+blog);

        blog.restore(backUp);
        System.out.println("备份恢复: "+blog);
    }

}
