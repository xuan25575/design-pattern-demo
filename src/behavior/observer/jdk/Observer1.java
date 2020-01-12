package behavior.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author huang_2
 * @Date 2019/12/19 9:16 下午
 * @Description TODO
 */
public class Observer1 implements Observer {

    private Subject subject; //主题
    private Object object;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Subject){
            Subject subject = (Subject)o;
            this.object =  subject.getObject();
            display();
        }
    }

    private void display() {
        System.out.println("观察者1 收到主题消息："+ object);

    }
}
