package structure.decorator;

/**
 * @Author huang_2
 * @Date 2019/12/19 11:14 下午
 * @Description 适配器模式
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，
 * Decorator模式相比生成子类，更为灵活
 */
public abstract class Beverage {
    // 返回描述
    public abstract String getDescription();

    // 返回价格
    public abstract double cost();
}


class BlackTea extends Beverage {
    public String getDescription() {
        return "红茶";
    }

    public double cost() {
        return 10;
    }
}

class GreenTea extends Beverage {
    public String getDescription() {
        return "绿茶";
    }

    public double cost() {
        return 11;
    }
}