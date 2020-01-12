package behavior.observer;

/**
 * @Author huang_2
 * @Date 2019/12/19 9:06 下午
 * @Description TODO
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
