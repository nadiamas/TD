package fr.paris10.poa.td3.Q2.FactoryMethod.Product;

/**
 * Created by nadia on 17/10/2016.
 */
public class ProductA implements Product{
    @Override
    public void doo() {
        System.out.println("i'm a product A , doing my stuff");
    }

    ProductA(){

    }
}
