package fr.paris10.poa.td3.Q2.FactoryMethod.Product;

/**
 * Created by nadia on 17/10/2016.
 */
public class ProductFactory {

    private static ProductFactory instance;

    private ProductFactory(){

    }
    public static  synchronized ProductFactory getInstance(){
        if (instance==null){
            instance= new ProductFactory();
        }
        return instance;
    }

    public Product createProduct(String name) {
        Product A,B,C;
        if (name.equals("Product A")) {
            return new ProductA();
        }
        if (name.equals("Product B")) {
            return new ProductB();
        }
        if (name.equals("Product C")) {
             return new ProductC();
        }
        return null;
    }



}
