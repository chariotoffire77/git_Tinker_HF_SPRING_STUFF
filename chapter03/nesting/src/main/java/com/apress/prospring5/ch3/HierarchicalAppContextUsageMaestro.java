package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;



public class HierarchicalAppContextUsageMaestro {

    public static void main (String ... args ){
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:spring/parent-context-maestro.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:spring/child-context-maestro.xml");
        child.setParent(parent);
        child.refresh();

        Automobile car1 = (Automobile) child.getBean("car1");

        Automobile car2 = (Automobile) child.getBean("car2");

        Automobile car3 = (Automobile) child.getBean("car3");

        System.out.println("from parent ctx: " + car1.getCarName());
        System.out.println("from child ctx: " + car2.getCarName());
        System.out.println("from parent ctx: " + car3.getCarName());

    }

}
