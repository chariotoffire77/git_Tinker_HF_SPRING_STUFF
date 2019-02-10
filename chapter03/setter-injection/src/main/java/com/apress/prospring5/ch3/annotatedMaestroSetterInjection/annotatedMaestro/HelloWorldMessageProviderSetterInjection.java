package com.apress.prospring5.ch3.annotatedMaestroSetterInjection.annotatedMaestro;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Simple Bean
@Component("provider")
public class HelloWorldMessageProviderSetterInjection implements MessageProvider{

    private String message;

    @Override
    public String getMessage(){
        return message ;
    }

    @Autowired
    public void setMessage (String message) {
        this.message = message;
    }
}
