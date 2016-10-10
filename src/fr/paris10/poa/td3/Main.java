package fr.paris10.poa.td3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nadia on 10/10/2016.
 */
public class Main {

    static{
        try{
            Class.forName("shapes.Circle");
            Class.forName("shapes.Square");

        }
        catch (ClassNotFoundException any){
            any.printStackTrace();
        }

    }
    public static void main(String[] args){
        List<Shape> sh = new ArrayList<>();
    }
}
