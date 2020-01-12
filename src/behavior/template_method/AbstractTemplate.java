package behavior.template_method;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:18 下午
 * @Description 模板方法模式
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。
 * 可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 *
 */
public abstract class AbstractTemplate {

    // 这就是模板方法
    public void templateMethod() {
        init();
        apply(); // 这个是重点
        end(); // 可以作为钩子方法
    }

    protected void init() {
        System.out.println("init 抽象层已经实现，子类也可以选择覆写");
    }

    // 留给子类实现
    protected abstract void apply();

    protected void end() {
    }
}

class ConcreteTemplate extends AbstractTemplate {
    public void apply() {
        System.out.println("子类实现抽象方法 apply");
    }

    public void end() {
        System.out.println("我们可以把 method3 当做钩子方法来使用，需要的时候覆写就可以了");
    }
}
