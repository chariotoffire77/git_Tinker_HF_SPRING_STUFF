package com.apress.prospring5.ch3.xmlMaestro;

public class Singer {
    private String lyric = "I played a quick game of chess with the salt and pepper shaker";

    public void sing(){
        // commented out to avoid pollution
        // because it will be called over
        //100000 times from driver program
        //System.out.println(lyric);
    }
}
