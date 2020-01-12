package behavior.strategy;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:17 下午
 * @Description
 * 和桥梁模式 较像。
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context(new BluePen()); // 使用绿色笔来画
        context.executeDraw(10, 0, 0);
    }
}
