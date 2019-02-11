package com.apress.prospring5.ch3.xmlResolvingDependenciesMaestro;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {
    public static void main (String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        ctx.load("classpath:spring/app-context-maestro-resolve-dependencies.xml");
        ctx.refresh();

        Singer johnMayer = ctx.getBean("johnMayer", Singer.class);
        johnMayer.sing();

        ctx.close();
    }
}
