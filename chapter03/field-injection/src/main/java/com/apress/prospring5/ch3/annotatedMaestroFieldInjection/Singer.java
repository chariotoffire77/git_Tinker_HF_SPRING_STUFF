package com.apress.prospring5.ch3.annotatedMaestroFieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// AKA Complex bean
// field injection demo
@Service("singer")
public class Singer {
    @Autowired
    private Inspiration inspirationBean;

    public void sing(){
        System.out.println("MAESTRO >>..."+inspirationBean.getLyric());
    }
}

