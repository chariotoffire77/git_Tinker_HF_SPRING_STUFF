package com.apress.prospring5.ch3.annotatedMaestro;

import com.apress.prospring5.ch2.decoupled.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class DriveAnnotatedMaestroHelloWorld {

    public static void main(String... args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "classpath:spring/app-context-maestro-pg54-annotation.xml");

        MessageRenderer messageRenderer = ctx.getBean(
                "renderer", MessageRenderer.class);
        messageRenderer.render();

    }

}
