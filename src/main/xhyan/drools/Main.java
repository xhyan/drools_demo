package xhyan.drools;

import java.util.Arrays;


/**
 * Created by xhyan_000 on 2015/7/9.
 */
public class Main {

    public static void main (String[] args) {
        RulesEngine engine = new RulesEngineImpl();

        Router router = new Router();
        router.setPoint(1000);
        router.setUsername("xhyan11");
        router.setBrithdayMonth(true);
        router.setCountOfMonth(10);
        router.setNewMemberIn3Months(true);
        router.setWeekend(true);

        Promotion promotion = new Promotion();
        engine.excuteCuleEngine(Arrays.asList(router, promotion));

        System.out.println("发放消费积分:"+router.getUsername()+":" + router.getPoint());

    }
}
