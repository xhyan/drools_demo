package xhyan.drools.router;

import xhyan.drools.RulesEngine;

import java.util.Arrays;


/**
 * 渠道路由入口
 */
public class RouterEntrance {

    public static void main (String[] args) {

        PaymentService paymentService = new PaymentServiceImpl();

        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setAmount(10000L);
        paymentDTO.setChannelId(10001L);
        paymentDTO.setPartnerId(10086L);
        paymentDTO.setPipeId(10010L);
        paymentDTO.setRouterType(1);

        RulesEngine engine = new RouterRulesEngineImpl();

        Router router = new Router();

        engine.excuteCuleEngine(Arrays.asList(paymentDTO, router,paymentService));
    }
}
