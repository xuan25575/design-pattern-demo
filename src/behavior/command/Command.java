package behavior.command;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:36 下午
 * @Description 命令模式
 *
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化;对请求排队
 * 或记录请求日志，以及支持可撤消的操作。
 */
public interface Command {
    void execute();

}

