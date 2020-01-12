package behavior.chain_reposibility;

/**
 * @Author huang_2
 * @Date 2019/12/20 10:01 下午
 * @Description 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这 些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 *
 *
 * 责任链通常需要先建立一个单向链表，然后调用方只需要调用头部节点就可以了，后面会自动流转下去。
 *比如流程审批就是一个很好的例子，只要终端用户提交申请，根据申请的内容信息，自动建立一条责任链，然后就可以开始流转了。
 *
 * 有这么一个场景，用户参加一个活动可以领取奖品，但是活动需要进行很多的规则校验然后才能放行，
 * 比如首先需要校验用户是否是新用户、
 * 今日参与人数是否有限额、全场参与人数是否有限额等等。设定的规则都通过后，才能让用户领走奖品。
 *
 *
 * 使用责任链的类
 */
public abstract class RuleHandler {
    // 后继节点
    protected RuleHandler successor;

    public abstract void apply(Context context);

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }

    public RuleHandler getSuccessor() {
        return successor;
    }
}


//校验用户是否是新用户
class NewUserRuleHandler extends RuleHandler {
    public void apply(Context context) {
        if (context.isNewUser()) {
            // 如果有后继节点的话，传递下去
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("该活动仅限新用户参与");
        }
    }
}
//校验用户所在地区是否可以参与
class LocationRuleHandler extends RuleHandler {



    public void apply(Context context) {

        // boolean allowed = activityService.isSupportedLocation(context.getLocation);

        boolean allowed = false;
        if (allowed) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("非常抱歉，您所在的地区无法参与本次活动");
        }
    }
}
//校验奖品是否已领
class LimitRuleHandler extends RuleHandler {
    public void apply(Context context) {
//        int remainedTimes = activityService.queryRemainedTimes(context); // 查询剩余奖品
        int remainedTimes = 0;
        if (remainedTimes > 0) {
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("您来得太晚了，奖品被领完了");
        }
    }
}

