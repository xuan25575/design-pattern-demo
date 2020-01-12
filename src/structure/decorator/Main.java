package structure.decorator;

/**
 * @Author huang_2
 * @Date 2019/12/19 11:18 下午
 * @Description
 *
 * java io
 * FilterInputStream 承接了装饰模式的关键节点，
 * 它的实现类是一系列装饰器，比如 BufferedInputStream 代表用缓冲来装饰，也就使得输入流具有了缓冲的功能，
 * LineNumberInputStream 代表用行号来装饰，
 * 在操作的时候就可以取得行号了，DataInputStream 的装饰，使得我们可以从输入流转换为 java 中的基本类型值。
 *
 *  java IO 中，如果我们使用装饰器的话，就不太适合面向接口编程了，
 * InputStream inputStream = new LineNumberInputStream(
 *                  new BufferedInputStream(new FileInputStream("")));
 *
 *
 *  DataInputStream is = new DataInputStream(
 *                               new BufferedInputStream(
 *                                   new FileInputStream("")));
 */
public class Main {

    public static void main(String[] args) {
        // 首先，我们需要一个基础饮料，红茶、绿茶或咖啡
        Beverage beverage = new GreenTea();
        // 开始装饰
        beverage = new Lemon(beverage); // 先加一份柠檬
        beverage = new Mongo(beverage); // 再加一份芒果

        System.out.println(beverage.getDescription() + " 价格：￥" + beverage.cost());
        //"绿茶, 加柠檬, 加芒果 价格：￥16"

        //芒果-珍珠-双份柠檬-红茶：
        //Beverage beverage = new Mongo(new Pearl(new Lemon(new Lemon(new BlackTea()))));
    }
}
