package com.apress.prospring5.ch3.annotationMaestroInjectSimple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpelAnnotation")
public class InjectSimpleSpelAnnotation {

    @Value("#{injectSimpleConfigAnnotation.name}")
    private String name;
    @Value("#{injectSimpleConfigAnnotation.age}")
    private int age;
    @Value("#{injectSimpleConfigAnnotation.height}")
    private float height;
    @Value("#{injectSimpleConfigAnnotation.programmer}")
    private boolean programmer;
    @Value("#{injectSimpleConfigAnnotation.ageInSeconds}")
    private Long ageInSeconds;
    @Value("#{injectSimpleConfigAnnotation.greeting}")
    private String greeting;

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Greeting: " + greeting + "\n"
                + "Is Programmer?: " + programmer;
    }

    public static void main(String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-simple-annotation-maestro.xml");
        ctx.refresh();
        InjectSimpleSpelAnnotation issa =(InjectSimpleSpelAnnotation) ctx.getBean("injectSimpleSpelAnnotation");
        System.out.println(issa);

        ctx.close();
    }
}
