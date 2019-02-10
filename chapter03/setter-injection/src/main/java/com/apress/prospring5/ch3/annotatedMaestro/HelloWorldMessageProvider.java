package com.apress.prospring5.ch3.annotatedMaestro;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

//Simple Bean
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage(){
        return "Hello World" ;
    }
}
