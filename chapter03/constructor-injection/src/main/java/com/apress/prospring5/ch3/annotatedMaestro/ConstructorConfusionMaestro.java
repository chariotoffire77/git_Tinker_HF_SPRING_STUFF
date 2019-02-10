package com.apress.prospring5.ch3.annotatedMaestro;

import com.apress.prospring5.ch3.annotated.ConstructorConfusion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;


@Service("constructorConfusionMaestro")
public class ConstructorConfusionMaestro {

    private String someValue;

    //@Autowired
    public ConstructorConfusionMaestro(String someValue){
        System.out.println("ConstructorConfusionMaestro(String) called");
        this.someValue = someValue;
    }

    @Autowired
    public ConstructorConfusionMaestro(/*@Value("90") */int someValue){
        System.out.println("ConstructorConfusionMaestro(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public String toString(){
        return someValue;
    }

    public static void main( String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation-maestro-constructor-confusion.xml");
        ctx.refresh();

        ConstructorConfusionMaestro cc = (ConstructorConfusionMaestro) ctx.getBean("constructorConfusionMaestro");
        System.out.println(cc);
        ctx.close();
    }
}
