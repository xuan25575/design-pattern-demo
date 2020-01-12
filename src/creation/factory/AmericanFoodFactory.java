package creation.factory;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:22 下午
 * @Description TODO
 */
public class AmericanFoodFactory implements FoodFactory {
    @Override
    public Food makeFood(String name) {
        return new Food("American Food");
    }
}
