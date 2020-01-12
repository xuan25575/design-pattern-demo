package creation.abstract_facotry;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:47 下午
 * @Description AMD 产品族
 */
public class AmdFactory implements ComputerFactory {
    @Override
    public CPU createCUP() {
        return new CPU("AMD");
    }

    @Override
    public MainBoard makeBoard() {
        return new MainBoard("AMD");
    }
}
