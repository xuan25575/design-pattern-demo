package behavior.state;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:22 下午
 * @Description 状态模式
 *
 * 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 *
 * 我们说一个简单的例子。商品库存中心有个最基本的需求是减库存和补库存，我们看看怎么用状态模式来写。
 * 核心在于，我们的关注点不再是 Context 是该进行哪种操作，而是关注在这个 Context 会有哪些操作。
 */
public interface State {
    public void doAction(Context context);
}

