package behavior.chain_reposibility;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:03 下午
 * @Description TODO
 */
public class Main {

    public static void main(String[] args) {
        Context context  =  new Context();

        RuleHandler newUserHandler = new NewUserRuleHandler();
        RuleHandler locationHandler = new LocationRuleHandler();
        RuleHandler limitHandler = new LimitRuleHandler();

        // 假设本次活动仅校验地区和奖品数量，不校验新老用户
        locationHandler.setSuccessor(limitHandler);

        locationHandler.apply(context);
    }
}
