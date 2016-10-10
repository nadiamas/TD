package fr.paris10.poa.td3;

/**
 * Created by nadia on 10/10/2016.
 */
public abstract class Shapes implements Shape{
    @Override
    public abstract Shape createShape() ;

    @Override
    public abstract void move(int dx, int dy);
}
