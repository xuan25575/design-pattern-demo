package behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:44 下午
 * @Description TODO
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
