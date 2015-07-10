package xhyan.drools.router;

/**
 * 支付对象，传输支付信息
 */
public class PaymentDTO {
    private Long partnerId;             //商户id
    private Long channelId;             //渠道id
    private Long pipeId;                //通道id
    private Long amount;                //支付金额
    private int routerType;             //路由类型：1-人工优先，2-成本优先


    public Long getPartnerId () {
        return partnerId;
    }


    public void setPartnerId (Long partnerId) {
        this.partnerId = partnerId;
    }


    public Long getChannelId () {
        return channelId;
    }


    public void setChannelId (Long channelId) {
        this.channelId = channelId;
    }


    public Long getPipeId () {
        return pipeId;
    }


    public void setPipeId (Long pipeId) {
        this.pipeId = pipeId;
    }


    public Long getAmount () {
        return amount;
    }


    public void setAmount (Long amount) {
        this.amount = amount;
    }


    public int getRouterType () {
        return routerType;
    }


    public void setRouterType (int routerType) {
        this.routerType = routerType;
    }
}
