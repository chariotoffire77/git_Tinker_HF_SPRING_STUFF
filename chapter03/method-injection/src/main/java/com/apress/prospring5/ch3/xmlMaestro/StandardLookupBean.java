package com.apress.prospring5.ch3.xmlMaestro;

public class StandardLookupBean implements DemoBean {
    private Singer mySinger;

    public void setMySinger( Singer mySinger ){ this.mySinger = mySinger;}

    @Override
    public Singer getMySinger(){
        return this.mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
