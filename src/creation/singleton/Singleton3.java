package creation.singleton;

/**
 * @Author huang_2
 * @Date 2019/12/18 10:18 下午
 * @Description
 */
public class Singleton3 {

    private Singleton3(){}

    // 主要是使用了 嵌套类可以访问外部类的静态属性和静态方法 的特性
    // 静态内部类和非静态内部类一样，都是在被调用时才会被加载，故不占用内存
    // 这种方法不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
    private static class Holder{
        private static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return Holder.instance;
    }
}
