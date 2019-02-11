package com.apress.prospring5.ch3.xmlResolvingDependenciesMaestro;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements ApplicationContextAware {
    private ApplicationContext ctx;
    @Override
    public void setApplicationContext (
            ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    private Guitar guitar;

    public Singer(){

    }

    public void sing(){
        guitar = ctx.getBean("gopher", Guitar.class);
        guitar.sing();
    }

}
