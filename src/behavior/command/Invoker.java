package behavior.command;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:38 下午
 * @Description TODO
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command;
    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){
        command.execute();
    }
}
