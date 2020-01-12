package creation.abstract_facotry;


/**
 * @Author huang_2
 * @Date 2019/12/18 9:53 下午
 * @Description 测试
 */
public class Test {

    public static void main(String[] args) {
        // 第一步就要选定一个“大厂”
        ComputerFactory cf = new AmdFactory();
        // 从这个大厂造 CPU
        CPU cpu = cf.createCUP();
        // 从这个大厂造主板
        MainBoard board = cf.makeBoard();
        // 从这个大厂造硬盘
//        HardDisk hardDisk = cf.makeHardDisk();

        // 将同一个厂子出来的 CPU、主板、硬盘组装在一起
        Computer result = new Computer(cpu, board);

        System.out.println(result);


    }
}
