package creation.singleton;

/**
 * @Author huang_2
 * @Date 2019/12/18 10:17 下午
 * @Description 双重检索模式
 *
 *
 */
public class Singleton2 {

    // 首先，也是先堵死 new Singleton() 这条路
    private Singleton2() {}

    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
    //volatile 内存屏障，禁止指令重排序。
    private static volatile Singleton2 instance = null;

    public static Singleton2 getInstance() {
        if (instance == null) { // 主要在这里可能多个线程进入，创建对象的线程持有的 instance 都是null
            // 所以在第二层 空检验也是必要的。
            // 加锁
            synchronized (Singleton.class) {
                // 这一次判断也是必须的，不然会有并发问题
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
