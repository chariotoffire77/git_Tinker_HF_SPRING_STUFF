package com.apress.prospring5.ch3.annotationMaestroInjectSimple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service("injectSimpleAnnotation")
public class InjectSimpleAnnotation {
    @Value("John Meyer")
    private String name;
    @Value("39")
    private int age;
    @Value("1.92")
    private float height;
    @Value("false")
    private boolean programmer;
    @Value(("1241401112"))
    private Long ageInSeconds;
    @Value("Maestro AKA The Assassin")
    private String greeting;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-simple-annotation-maestro.xml");
        ctx.refresh();

        InjectSimpleAnnotation simple = (InjectSimpleAnnotation) ctx.getBean("injectSimpleAnnotation");
        System.out.println(simple);

        ctx.close();
    }



    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Greeting: " + greeting + "\n"
                + "Is Programmer?: " + programmer;
    }
}
