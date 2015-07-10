package xhyan.drools.point;

import xhyan.drools.RulesEngine;

import java.util.Arrays;


/**
 * Created by xhyan_000 on 2015/7/9.
 */
public class Main {

    public static void main (String[] args) {
        RulesEngine engine = new RulesEngineImpl();

        PointDTO pointDTO = new PointDTO();
        pointDTO.setPoint(1000);
        pointDTO.setUsername("xhyan11");
        pointDTO.setBrithdayMonth(true);
        pointDTO.setCountOfMonth(10);
        pointDTO.setNewMemberIn3Months(true);
        pointDTO.setWeekend(true);

        Promotion promotion = new Promotion();
        engine.excuteCuleEngine(Arrays.asList(pointDTO, promotion));

        System.out.println("发放消费积分:"+ pointDTO.getUsername()+":" + pointDTO.getPoint());

    }
}
