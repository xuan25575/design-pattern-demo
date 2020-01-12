package structure.proxy;

import creation.factory.Food;

/**
 * @Author huang_2
 * @Date 2019/12/19 8:24 下午
 * @Description  代理模式：为其他对象提供一种代理以控制对这个对象的访问。
 *  代理接口
 */
public interface FoodService {
    Food makeChicken();
    Food makeNoodle();
}
