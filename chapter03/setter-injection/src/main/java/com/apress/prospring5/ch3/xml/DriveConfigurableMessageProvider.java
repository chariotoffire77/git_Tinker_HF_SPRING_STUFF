package com.apress.prospring5.ch3.xml;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DriveConfigurableMessageProvider {

    public static void main( String ... args){

        /*
        GenericApplicationContext ctx = new GenericApplicationContext();
        // looks like load method is missing.....
        ctx.load("classpath:spring/app-context-maestro-pg58-xml.xml");
        ctx.refresh();
        */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context-maestro-pg58-xml.xml");

        // This one works
        // MessageProvider cmp = ctx.getBean("messageProvider", ConfigurableMessageProvider.class);

        MessageProvider cmp = ctx.getBean("messageProvider2", ConfigurableMessageProvider.class);

        MessageProvider cmp2 = (ConfigurableMessageProvider)ctx.getBean("messageProvider2");

        System.out.println("------> Maestro  ctx.getBean(\"messageProvider2\", ConfigurableMessageProvider.class) "+ cmp.getMessage());

        System.out.println("------> Option 2 ---> Maestro (ConfigurableMessageProvider)ctx.getBean(\"messageProvider2\")"+ cmp2.getMessage());
    }
}
