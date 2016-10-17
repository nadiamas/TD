package fr.paris10.poa.td3.Q2.FactoryMethod.client;

import fr.paris10.poa.td3.Q2.FactoryMethod.Product.Product;
import fr.paris10.poa.td3.Q2.FactoryMethod.Product.ProductFactory;

/**
 * Created by nadia on 17/10/2016.
 */
public class Client {
    Product prod1 ;
    ProductFactory factory ;

    public Client(){
        factory = ProductFactory.getInstance();
        prod1= factory.createProduct("Product A");

    }

    public void foo(){
        Product myProd1,myProd2;
        prod1.doo();
        myProd1 = factory.createProduct("Product B");
        myProd1.doo();


    }
}
