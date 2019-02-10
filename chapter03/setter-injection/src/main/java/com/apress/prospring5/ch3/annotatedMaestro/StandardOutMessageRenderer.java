package com.apress.prospring5.ch3.annotatedMaestro;

import com.apress.prospring5.ch2.decoupled.MessageProvider;
import com.apress.prospring5.ch2.decoupled.MessageRenderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//complex, service bean
@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer{
    private MessageProvider messageProvider;

    @Override
    public void render(){
        if (messageProvider == null){
            throw new RuntimeException("You must set the property messageProvider of class: "
                    + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider( MessageProvider messageProvider ){
        this.messageProvider = messageProvider;

    }

    @Override
    public MessageProvider getMessageProvider(){
        return this.messageProvider;
    }
}
