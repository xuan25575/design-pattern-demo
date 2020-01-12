package creation.factory;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:12 下午
 * @Description 工厂模式
 *  工厂模式 定义出抽象接口，将不同实现交给对应的对象实现。
 *
 *
 */
public interface FoodFactory {
    Food makeFood(String name);
}
