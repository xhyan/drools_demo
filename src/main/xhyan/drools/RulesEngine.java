package xhyan.drools;

import java.util.List;


/**
 * 规则引擎接口
 */
public interface RulesEngine {

    /*
    * 初始化
    * */
    public void init();

    /*
    * 执行
    * */
    public void excuteCuleEngine(List<Object> list);
}
