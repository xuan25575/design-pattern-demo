package behavior.state;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:25 下午
 * @Description TODO
 */
public class DeductState implements State {

    public void doAction(Context context) {
        System.out.println("商品卖出，准备减库存");
        context.setState(this);

        //... 执行减库存的具体操作
    }

    public String toString() {
        return "Deduct State";
    }
}
