package creation.factory;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:17 下午
 * @Description TODO
 */
public class ChineseFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new Food("A");
        } else if (name.equals("B")) {
            return new Food("B");
        } else {
            return null;
        }
    }
}
