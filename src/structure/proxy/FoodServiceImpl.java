package structure.proxy;

import creation.factory.Food;

/**
 * @Author huang_2
 * @Date 2019/12/19 8:26 下午
 * @Description TODO
 */
public class FoodServiceImpl implements FoodService {
    @Override
    public Food makeChicken() {
        return new Chicken("chicken");
    }

    @Override
    public Food makeNoodle() {
        return new Noodle("noodle");
    }
}
