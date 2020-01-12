package behavior.state;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:25 下午
 * @Description TODO
 */
public class Main {

    //读者可能会发现，在上面这个例子中，如果我们不关心当前 context 处于什么状态，
    // 那么 Context 就可以不用维护 state 属性了，那样代码会简单很多。
    public static void main(String[] args) {
        // 我们需要操作的是 iPhone X
        Context context = new Context("iPhone X");

        // 看看怎么进行补库存操作
        State revertState = new RevertState();
        revertState.doAction(context);

        // 同样的，减库存操作也非常简单
        State deductState = new DeductState();
        deductState.doAction(context);

        // 如果需要我们可以获取当前的状态
        // context.getState().toString();
    }
}
