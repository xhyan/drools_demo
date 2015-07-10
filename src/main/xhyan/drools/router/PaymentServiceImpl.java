package xhyan.drools.router;

import xhyan.drools.RulesEngine;
import xhyan.drools.point.RulesEngineImpl;

import java.util.Arrays;


public class PaymentServiceImpl implements PaymentService {


    /**
     * 支付
     * @param payment     支付信息对象
     *
     */
    @Override
    public void payment (PaymentDTO payment) {

        System.out.println("payment user pipe = [" + payment.getPipeId() + "]");
    }

}
