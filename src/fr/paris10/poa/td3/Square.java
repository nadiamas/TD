package fr.paris10.poa.td3;

/**
 * Created by nadia on 10/10/2016.
 */
public class Square extends Shapes {

    static  {
        ShapesFactory.registerShape("Square",new Square());
    }

    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public void move(int dx, int dy) {
    }

}
