package behavior.template_method;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:21 下午
 * @Description TODO
 */
public class Main {

    public static void main(String[] args) {
        AbstractTemplate t = new ConcreteTemplate();
        // 调用模板方法
        t.templateMethod();
    }
}
