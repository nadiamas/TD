package fr.paris10.poa.td3.Q2.FactoryMethod.Product;

/**
 * Created by nadia on 17/10/2016.
 */
public class ProductC implements  Product{

    @Override
    public void doo() {
        System.out.println("i'm produit B ");
    }

    public ProductC() {
    }
}
