package creation.abstract_facotry;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:34 下午
 * @Description TODO
 */
public class CPU {

    private String name;

    public CPU(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "name='" + name + '\'' +
                '}';
    }
}
