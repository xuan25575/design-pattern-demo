package creation.abstract_facotry;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:54 下午
 * @Description TODO
 */
public class Computer {

    private CPU cpu;

    private MainBoard mainBoard;

    public Computer(CPU cpu, MainBoard board) {
        this.cpu = cpu;
        this.mainBoard =  board;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", mainBoard=" + mainBoard +
                '}';
    }
}
