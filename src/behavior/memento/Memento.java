package behavior.memento;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:42 下午
 * @Description 备忘录模式：保存一个对象的某个状态，以便在适当的时候恢复对象。
 */
public class Memento {

    private String state;

    public Memento() {
    }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
