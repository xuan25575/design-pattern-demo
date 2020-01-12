package creation.abstract_facotry;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:46 下午
 * @Description TODO
 */
public class InterFactory implements ComputerFactory {
    @Override
    public CPU createCUP() {
        return new CPU("inter");
    }

    @Override
    public MainBoard makeBoard() {
        return new MainBoard("inter");
    }
}
