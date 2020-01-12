package structure.bridge;

/**
 * @Author huang_2
 * @Date 2019/12/19 11:03 下午
 * @Description 桥接模式
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 */
public interface DrawAPI {

    void draw(int radius, int x, int y);
}


class RedPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}

class GreenPen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}

class BluePen implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
