package fr.paris10.poa.td3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nadia on 10/10/2016.
 */
public final class ShapesFactory  {
    private static Map<String,Shapes> registry= new HashMap<String,Shapes>();

    public static void  registerShape(String name , Shapes s){
        registry.put(name,s);

    }


    public Shape createShape(String name){
        return registry.get(name).createShape();
    }

    public static Map<String, Shapes> getRegistry() {
        return registry;
    }

    public static void setRegistry(Map<String, Shapes> registry) {

        ShapesFactory.registry = registry;
    }
}
