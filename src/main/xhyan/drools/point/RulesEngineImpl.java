package xhyan.drools.point;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.drools.runtime.rule.Activation;
import org.drools.runtime.rule.AgendaFilter;
import xhyan.drools.RulesEngine;

import java.util.List;


/**
 * 规则引擎实现类
 */
public class RulesEngineImpl implements RulesEngine {

    private KnowledgeBase knowledgeBase;


    public RulesEngineImpl () {
        init();
    }


    @Override
    public void init () {
        KnowledgeBuilderConfiguration config = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
        // 这里可以将经过antlr词法分析生成的java源代码dump下来
        config.setProperty("drools.dump.dir", "F:\\drools\\");
        System.setProperty("drools.dateformat", "yyyy-MM-dd HH:mm:ss");

        KnowledgeBuilder knowledgeBuilder = new KnowledgeBuilderFactory().newKnowledgeBuilder(config);
        knowledgeBuilder.add(ResourceFactory.newClassPathResource("drools/point.drl"), ResourceType.DRL);
        if (knowledgeBuilder.hasErrors()){
            throw new RuntimeException("Rules has error! pls check it!" + knowledgeBuilder.getErrors());
        }

        knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();
        knowledgeBase.addKnowledgePackages(knowledgeBuilder.getKnowledgePackages());
    }


    @Override public void excuteCuleEngine (List<Object> list) {
        StatefulKnowledgeSession session = knowledgeBase.newStatefulKnowledgeSession();
        for (Object obj : list){
            session.insert(obj);
        }

        session.fireAllRules(new AgendaFilter() {
            @Override
            public boolean accept (Activation activation) {
                System.out.println("excute rule Name is :" + activation.getRule().getName());
                return true;// 控制规则的执行与否
            }
        });
        session.dispose();
    }
}
