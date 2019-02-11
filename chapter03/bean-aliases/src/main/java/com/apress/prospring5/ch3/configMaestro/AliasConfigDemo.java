package com.apress.prospring5.ch3.configMaestro;

import com.apress.prospring5.ch3.annotatedMaestro.Singer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {

    @Configuration
    public static class AliasBeanConfig {
        //@Bean
        //
        // @Bean(name={"bean1", "bean2", "bean3"})
        @Bean(name={"johnMayer", "john", "jonathan", "johnny"})
        public Singer singer(){
            return new Singer();
        }
    }

    public static void main(String ... args){
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AliasBeanConfig.class);

        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);

        beans.entrySet().stream().forEach(
                b->System.out.println("id: "+b.getKey()+"\n aliases: "+
                        Arrays.toString(ctx.getAliases(b.getKey()))+"\n")
        );

        Singer singer1 = (Singer)ctx.getBean("johnMayer");
        singer1.sing();

        ctx.close();
    }
}
