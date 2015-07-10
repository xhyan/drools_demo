package xhyan.drools.router;

/**
 * 通道传输对象
 */
public class PipeDTO {

    private String name;                //通道名称
    private int status;                 //通道状态：1正常,2暂停
    private int rateType;               //费率类型：1-包年/月模式，2-按笔收费，3-交易金额百分比
    private int rateAmount;             //费率值
    private int orderNo;                //优先级


    public String getName () {
        return name;
    }


    public void setName (String name) {
        this.name = name;
    }


    public int getStatus () {
        return status;
    }


    public void setStatus (int status) {
        this.status = status;
    }


    public int getRateType () {
        return rateType;
    }


    public void setRateType (int rateType) {
        this.rateType = rateType;
    }


    public int getRateAmount () {
        return rateAmount;
    }


    public void setRateAmount (int rateAmount) {
        this.rateAmount = rateAmount;
    }


    public int getOrderNo () {
        return orderNo;
    }


    public void setOrderNo (int orderNo) {
        this.orderNo = orderNo;
    }
}
