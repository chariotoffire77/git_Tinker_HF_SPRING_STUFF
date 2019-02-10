package com.apress.prospring5.ch3.xmlMaestro;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;


public class LookupDemo {

    public  static void main (String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load( "classpath:spring/app-context-maestro-method-lookup-xml.xml");
        ctx.refresh();
        DemoBean abstractBean = (DemoBean) ctx.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = (DemoBean) ctx.getBean("standardLookupBean", DemoBean.class);

        displayInfo("abstractLookupBean", abstractBean);
        displayInfo("standardLookupBean", standardBean);
        ctx.close();
    }

    public static void displayInfo(String beanName, DemoBean demoBean){
        Singer singer1 = demoBean.getMySinger();
        Singer singer2 = demoBean.getMySinger();

        System.out.println("[" + beanName+ "]: Singer Instances the Same? " + (singer1 == singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");

        for (int x=0; x<100000; x++){
            Singer singer = demoBean.getMySinger();
            singer.sing();
        }

        stopWatch.stop();
        System.out.println("100000 gets took "+stopWatch.getTotalTimeSeconds()+" s, "+
                stopWatch.getTotalTimeMillis()+" ms");
    }
}
