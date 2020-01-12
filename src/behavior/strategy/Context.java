package behavior.strategy;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:15 下午
 * @Description 使用策略的类
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeDraw(int radius, int x, int y){
        strategy.draw(radius, x, y);
        return 1;
    }
}
