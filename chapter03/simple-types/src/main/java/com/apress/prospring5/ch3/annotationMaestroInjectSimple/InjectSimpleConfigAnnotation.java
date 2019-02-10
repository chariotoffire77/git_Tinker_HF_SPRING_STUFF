package com.apress.prospring5.ch3.annotationMaestroInjectSimple;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfigAnnotation")
public class InjectSimpleConfigAnnotation {

    private String name = "John Mayer";
    private int age = 40;
    private float height = 1.92f;
    private boolean programmer = false;
    private Long ageInSeconds  =  1_241_401_112L;
    private String greeting = "Laus Deo !!!";

    public String getName(){ return name; }
    public int getAge() { return age; }
    public float getHeight() {return height;}

    public boolean isProgrammer() {
        return programmer;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public String getGreeting(){
        return greeting;
    }
}
