package com.apress.prospring5.ch3.annotatedMaestroFieldInjection;

import org.springframework.context.support.GenericXmlApplicationContext;


public class MaestroFieldInjectionDemo {

    public static void main (String ... args ){

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-maestro-field-injection.xml");

        ctx.refresh();

        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();

        ctx.close();
    }

}

