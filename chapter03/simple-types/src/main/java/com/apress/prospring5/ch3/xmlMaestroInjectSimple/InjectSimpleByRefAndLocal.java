package com.apress.prospring5.ch3.xmlMaestroInjectSimple;

import org.springframework.context.support.GenericXmlApplicationContext;


public class InjectSimpleByRefAndLocal {
    private InjectSimpleConfigXml injectSimpleConfigXml;

    public void setInjectSimpleConfigXml( InjectSimpleConfigXml injectSimpleConfigXml){
        this.injectSimpleConfigXml = injectSimpleConfigXml;
    }

    public InjectSimpleConfigXml getInjectSimpleConfigXml(){
        return injectSimpleConfigXml;
    }

    public static void main( String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-simple-xml-maestro.xml");
        ctx.refresh();
        InjectSimpleByRefAndLocal injectSimpleByRefAndLocal =
                (InjectSimpleByRefAndLocal) ctx.getBean("injectSimpleByRefAndLocal") ;

        System.out.println(injectSimpleByRefAndLocal.getInjectSimpleConfigXml());
    }
}
