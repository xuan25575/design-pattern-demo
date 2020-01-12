package structure.adapter;

/**
 * @Author huang_2
 * @Date 2019/12/19 11:24 下午
 * @Description 适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口。 而不能一起工作的那些类可以一起工作。
 *
 * 适配器模式总体来说分三种：默认适配器模式、对象适配器模式、类适配器模式.
 *
 * 默认适配器模式  swing中很多 WindowAdapter  由于接口中的方法多 ，适配器提供空实现，
 * 子类只需要重写相应方法
 *
 * 对象适配器模式
 *    组合的方式实现， 如下面的例子的实现。
 *
 *  类适配器模式
 *    采用继承的方式实现。
 */
public class Main {

    public static void main(String[] args) {
        // 有一只野鸡
        Cock wildCock = new WildCock();
        // 成功将野鸡适配成鸭
        Duck duck = new CockAdapter(wildCock);

    }
}
