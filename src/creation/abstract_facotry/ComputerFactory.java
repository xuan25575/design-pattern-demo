package creation.abstract_facotry;

/**
 * @Author huang_2
 * @Date 2019/12/18 9:30 下午
 * @Description  抽象工厂模式
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 *
 * 产品族
 * 电脑包括主板和CPU
 * 主板
 * CPU
 * 如果需要扩展硬盘，只需要在接口中加入硬盘接口即可
 *
 * 这样不需要为每个小产品都创建工厂。
 * 主要为了解决不同产品兼容性问题。
 *
 *
 */
public interface ComputerFactory {


    CPU createCUP();

    MainBoard makeBoard();

}
