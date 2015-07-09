package xhyan.drools;

/**
 * 本期新增
 */
public class Promotion {

    private boolean inPromotion;
    private long point;                 //积分


    public boolean isInPromotion () {
        return inPromotion;
    }


    public void setInPromotion (boolean inPromotion) {
        this.inPromotion = inPromotion;
    }


    public long getPoint () {
        return point;
    }


    public void setPoint (long point) {
        this.point = point;
    }
}
