package behavior.strategy;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:13 下午
 * @Description 策略模式
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。本模式使得算法可独 立于使用它的客户而变化。
 *
 */
public interface Strategy {
    public void draw(int radius, int x, int y);

}


 class RedPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
 class GreenPen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
 class BluePen implements Strategy {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}