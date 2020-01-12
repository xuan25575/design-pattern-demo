package structure.facade;

/**
 * @Author huang_2
 * @Date 2019/12/19 10:54 下午
 * @Description TODO
 */

public class Main{
    public static void main(String[] args) {
        // 画一个圆形
        Shape circle = new Circle();
        circle.draw();

        // 画一个长方形
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}


class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}



 class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}


class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square::draw()");

    }
}


