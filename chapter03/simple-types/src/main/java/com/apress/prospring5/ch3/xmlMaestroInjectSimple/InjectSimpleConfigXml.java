package com.apress.prospring5.ch3.xmlMaestroInjectSimple;

public class InjectSimpleConfigXml {
    private String name="John Mayer";
    private int age = 39;
    private float height = 1.92f;
    private boolean programmer = false;
    private Long ageInSeconds = 1_241_401_112L;
    private String greeting = "laus Deo !!!";

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public float getHeight() {
        return this.height;
    }

    public boolean isProgrammer() {
        return this.programmer;
    }

    public Long getAgeInSeconds() {
        return this.ageInSeconds;
    }

    public String getGreeting(){ return greeting; }

    public String toString() {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Age in Seconds: " + ageInSeconds + "\n"
                + "Height: " + height + "\n"
                + "Greeting: " + greeting + "\n"
                + "Is Programmer?: " + programmer;
    }
}
