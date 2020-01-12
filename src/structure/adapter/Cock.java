package structure.adapter;

/**
 * @Author huang_2
 * @Date 2019/12/19 11:22 下午
 * @Description TODO
 */
public interface Cock {
    public void gobble(); // 鸡的咕咕叫
    public void fly(); // 飞
}


 class WildCock implements Cock {
    public void gobble() {
        System.out.println("咕咕叫");
    }
    public void fly() {
        System.out.println("鸡也会飞哦");
    }
}