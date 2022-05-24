package com.yaron.principle.OpenClose;

public class Ocp {

    public static void main(String[] args) {

        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
        editor.drawShape(new Triangle());
        editor.drawShape(new Other());
    }


}

class GraphicEditor {

    /**
     * 对使用方 关闭修改
     * @param shape
     */
    public void drawShape(Shape shape){
        shape.draw();
    }
}


abstract class Shape {

    int m_type;

    public abstract void draw();

}

/**
 * 对提供方 开放
 */
class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("矩形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}


class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("三角形");
    }
}

class Other extends Shape {
    @Override
    public void draw() {
        System.out.println("other..");
    }
}


