package xhyan.drools;

/**
 * 路由对象.
 */
public class Router {

    private String username;            //用户姓名
    private boolean brithdayMonth;      //是否是生日月
    private boolean newMemberIn3Months; //是否是三个月内新用户
    private boolean weekend;            //是否是周末
    private int countOfMonth;           //月消费次数
    private long point;                 //积分
    private long totalAmount;           //消费金额
    private boolean issue;              //是否已发放

    public void print(){
        System.out.println(String.format("%s is issued %s point!", username, point));
    }


    public String getUsername () {
        return username;
    }


    public void setUsername (String username) {
        this.username = username;
    }


    public boolean isBrithdayMonth () {
        return brithdayMonth;
    }


    public void setBrithdayMonth (boolean brithdayMonth) {
        this.brithdayMonth = brithdayMonth;
    }


    public boolean isNewMemberIn3Months () {
        return newMemberIn3Months;
    }


    public void setNewMemberIn3Months (boolean newMemberIn3Months) {
        this.newMemberIn3Months = newMemberIn3Months;
    }


    public boolean isWeekend () {
        return weekend;
    }


    public void setWeekend (boolean weekend) {
        this.weekend = weekend;
    }


    public int getCountOfMonth () {
        return countOfMonth;
    }


    public void setCountOfMonth (int countOfMonth) {
        this.countOfMonth = countOfMonth;
    }


    public long getPoint () {
        return point;
    }


    public void setPoint (long point) {
        this.point = point;
    }


    public long getTotalAmount () {
        return totalAmount;
    }


    public void setTotalAmount (long totalAmount) {
        this.totalAmount = totalAmount;
    }


    public boolean isIssue () {
        return issue;
    }


    public void setIssue (boolean issue) {
        this.issue = issue;
    }
}
