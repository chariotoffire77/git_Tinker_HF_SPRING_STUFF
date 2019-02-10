package com.apress.prospring5.ch3.xmlMaestroInjectSimple;

import org.springframework.context.support.GenericXmlApplicationContext;


public class InjectSimpleSpelXml {
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long ageInSeconds;
    private String greeting;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return this.programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeInSeconds() {
        return this.ageInSeconds;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }

    public void setGreeting(String greeting) { this.greeting = greeting;}

    public String getGreeting(){ return greeting; }

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Greeting: " + greeting + "\n"
                + "Is Programmer?: " + programmer;
    }

    public static void main (String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-simple-xml-maestro.xml");
        ctx.refresh();
        InjectSimpleSpelXml issx = (InjectSimpleSpelXml) ctx.getBean("injectSimpleSpelXml");
        System.out.println ( issx );
        ctx.close();
    }
}
