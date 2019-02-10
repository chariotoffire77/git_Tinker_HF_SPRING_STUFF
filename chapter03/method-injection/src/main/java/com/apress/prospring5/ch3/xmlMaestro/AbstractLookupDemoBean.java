package com.apress.prospring5.ch3.xmlMaestro;

public abstract class AbstractLookupDemoBean implements DemoBean{
    // method to be replaced by method lookup from CGLIB
    public abstract Singer getMySinger();

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
