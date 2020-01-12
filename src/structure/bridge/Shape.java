package structure.bridge;

/**
 * @Author huang_2
 * @Date 2019/12/19 11:06 下午
 * @Description TODO
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

// 圆形
class Circle extends Shape {
    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
}

// 长方形
class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    public void draw() {
        drawAPI.draw(0, x, y);
    }
}
