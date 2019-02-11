package com.apress.prospring5.ch3.annotatedResolvingDependenciesMaestro;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DependsOnDemo {
    public static void main (String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        ctx.load("classpath:spring/app-context-maestro-resolve-dependencies-ann.xml");
        ctx.refresh();

        Singer johnMayer = ctx.getBean("johnMayer", Singer.class);
        johnMayer.sing();

        ctx.close();
    }
}
