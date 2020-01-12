package behavior.state;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:23 下午
 * @Description TODO
 */
public class Context {

    private State state;
    private String name;

    public Context(String name) {
        this.name = name;
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return this.state;
    }
}
