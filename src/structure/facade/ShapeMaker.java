package structure.facade;

/**
 * @Author huang_2
 * @Date 2019/12/19 10:56 下午
 * @Description
 * 为子系统中的一组接口提供一个一致的界面，
 * Facade 模式定义了一个高层接口,这个接口使得这一子系统更加容易使用
 *
 * slf4j 就可以理解为是门面模式的应用。
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * 下面定义一堆方法，具体应该调用什么方法，由这个门面来决定
     */

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
