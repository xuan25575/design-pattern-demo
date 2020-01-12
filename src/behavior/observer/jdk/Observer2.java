package behavior.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author huang_2
 * @Date 2019/12/19 9:16 下午
 * @Description TODO
 */
public class Observer2 implements Observer {

    private Subject subject; //主题
    private Object object;

    public Observer2(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Subject){
            Subject subject = (Subject)o;
            Object content = subject.getObject();
            System.out.println("观察者2 收到主题消息："+ content);
        }
    }

}
