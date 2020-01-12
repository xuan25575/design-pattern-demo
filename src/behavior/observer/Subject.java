package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huang_2
 * @Date 2019/12/19 9:05 下午
 * @Description 定义对象间的一种一对多的依赖关系 ,当一个对象的状态发生改变时 ,
 * 所有依赖于它的对象 都得到通知并被自动更新。
 * 读者使用 Guava 中的 EventBus，它有同步实现也有异步实现
 *
 * 主题
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        // 数据已变更，通知观察者们
        notifyAllObservers();
    }
    // 注册观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }
    // 通知观察者们
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
