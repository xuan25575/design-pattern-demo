package behavior.state;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:25 下午
 * @Description TODO
 */
public class RevertState implements State {

    public void doAction(Context context) {
        System.out.println("给此商品补库存");
        context.setState(this);

        //... 执行加库存的具体操作
    }

    public String toString() {
        return "Revert State";
    }
}
