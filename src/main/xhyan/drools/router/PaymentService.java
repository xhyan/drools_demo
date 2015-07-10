package xhyan.drools.router;

/**
 * 支付接口
 */
public interface PaymentService {

    /**
     * 支付
     * @param payment     支付信息对象
     *
     */
    public void payment(PaymentDTO payment);
}
