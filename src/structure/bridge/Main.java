package structure.bridge;

/**
 * @Author huang_2
 * @Date 2019/12/19 11:10 下午
 * @Description TODO
 */
public class Main {
    public static void main(String[] args) {

        Shape greenCircle = new Circle(10, new GreenPen());
        Shape redRectangle = new Rectangle(4, 8, new RedPen());
        greenCircle.draw();
        redRectangle.draw();
    }
}
