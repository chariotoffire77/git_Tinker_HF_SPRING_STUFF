package com.apress.prospring5.ch3.xmlMaestro;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {

    public static void main (String ... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load( "classpath:spring/app-context-maestro-method-replacement-xml.xml");
        ctx.refresh();

        ReplacementTarget replacementTarget =(ReplacementTarget) ctx.
                getBean("replacementTarget");

        ReplacementTarget standardTarget =(ReplacementTarget) ctx.
                getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standardTarget);
    }

    private static void displayInfo (ReplacementTarget target){
        System.out.println(target.formatMessage("Thanks for playing, try again!"));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");
        int numIterations=1000000;
        for( int x=0; x<numIterations;x++){
            String out = target.formatMessage("No filter in my head.");
        }

        stopWatch.stop();
        String msg =
                String.format("%d invocations took: %d ms %f s",
                        numIterations, stopWatch.getTotalTimeMillis(),
                        stopWatch.getTotalTimeSeconds());
        System.out.println(msg);

    }



}
