package com.apress.prospring5.ch3.annotatedMaestro;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Service("injectCollectionMaestro")
public class CollectionInjection {
    @Resource(name="map")
    private Map<String, Object> map;
    @Resource(name="props")
    private Properties props;
    @Resource(name="set")
    private Set set;
    @Resource(name="list")
    private List list;
/*
    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

*/
    public static void main (String ... args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-maestro-annotation.xml");
        ctx.refresh();

        CollectionInjection instance =
                (CollectionInjection) ctx.getBean("injectCollectionMaestro");

        instance.displayInfo();
        ctx.close();
    }

    public void displayInfo(){
        System.out.println("Map contents:\n");
        map.entrySet().stream().forEach(e->System.out.println("Key: "+e.getKey()+" - Value: "+e.getValue()));

        System.out.println("\nProperties contents:\n");
        props.entrySet().stream().forEach(e->System.out.println("Key: "+e.getKey()+" - Value: "+e.getValue()));

        System.out.println("\nSet contents:\n");
        set.forEach( obj -> System.out.println("Value: "+ obj));

        System.out.println("\nList contents:\n");
        list.forEach( obj -> System.out.println("Value: "+ obj));
    }

}
