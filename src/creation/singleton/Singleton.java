package creation.singleton;

import java.util.Date;

/**
 * @Author huang_2
 * @Date 2019/12/18 10:09 下午
 * @Description 单例模式
 */
public class Singleton {

    //首先 私有化构造器
    private Singleton() {};

    // 创建私有静态实例，意味着这个类第一次使用的时候就会进行创建
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
