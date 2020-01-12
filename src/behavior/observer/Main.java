package behavior.observer;

import behavior.observer.jdk.Observer1;
import behavior.observer.jdk.Observer2;

/**
 * @Author huang_2
 * @Date 2019/12/19 9:09 下午
 * @Description TODO
 */
public class Main {


    public static void main(String[] args) {
        // 先定义一个主题
        Subject subject = new Subject();
        // 定义观察者
        new BinaryObserver(subject);
        new HexaObserver(subject);
        // 模拟数据变更，这个时候，观察者们的 update 方法将会被调用
        subject.setState(11);


        //jdk  观察者模式实现

        behavior.observer.jdk.Subject subject2 = new behavior.observer.jdk.Subject ();
        new Observer1(subject2);
        new Observer2(subject2);
        subject2.publish("测试主题");



    }
}
