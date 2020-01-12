package creation.abstract_facotry;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:34 下午
 * @Description 主板
 */
public class MainBoard {

    private String name;

    public MainBoard(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "MainBoard{" +
                "name='" + name + '\'' +
                '}';
    }
}
