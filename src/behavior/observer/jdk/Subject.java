package behavior.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author huang_2
 * @Date 2019/12/19 9:11 下午
 * @Description TODO
 */
public class Subject extends Observable {

    private Object object ; // 主题内容


    // 发布
    public void publish(Object obj){
        this.object  = obj;
        setChanged();
        notifyObservers();
    }


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
